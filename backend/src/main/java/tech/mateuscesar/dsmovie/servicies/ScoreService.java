package tech.mateuscesar.dsmovie.servicies;

//responsavel por buscar os filmes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.mateuscesar.dsmovie.dto.MovieDTO;
import tech.mateuscesar.dsmovie.dto.ScoreDTO;
import tech.mateuscesar.dsmovie.entities.Movie;
import tech.mateuscesar.dsmovie.entities.Score;
import tech.mateuscesar.dsmovie.entities.User;
import tech.mateuscesar.dsmovie.repositories.MovieRepository;
import tech.mateuscesar.dsmovie.repositories.ScoreRepository;
import tech.mateuscesar.dsmovie.repositories.UserRepository;

@Service //componente do sitstema é necessaria por ser classe personalizada
public class ScoreService {
	@Autowired //
	private MovieRepository movieRepository; //busca filme no banco de dados
	

	@Autowired //
	private UserRepository userRepository; //busca filme no banco de dados
	
	@Autowired //
	private ScoreRepository scoreRepository; //busca filme no banco de dados
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if(user==null) {
			user=new User();
			user.setEmail(dto.getEmail());
			user=userRepository.saveAndFlush(user);
		}
		
		Movie movie =movieRepository.findById(dto.getMovieId()).get();
		
		Score score=new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score =scoreRepository.saveAndFlush(score);
		
		double sum=0.0;
		for(Score s : movie.getScores()) {
			sum=sum+s.getValue();
		}
		
		double avg = sum/movie.getScores().size();
		
		movie.setscore(avg);
		movie.setCount(movie.getScores().size());
		
		movie=movieRepository.save(movie);
		
		return new MovieDTO(movie);
		
	}
	
}
