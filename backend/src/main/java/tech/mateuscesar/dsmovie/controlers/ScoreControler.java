package tech.mateuscesar.dsmovie.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.mateuscesar.dsmovie.dto.MovieDTO;
import tech.mateuscesar.dsmovie.dto.ScoreDTO;
import tech.mateuscesar.dsmovie.servicies.ScoreService;

@RestController
@RequestMapping(value="/score")
public class ScoreControler {

	@Autowired
	private ScoreService service;

	@PutMapping()
	public MovieDTO saveScore( @RequestBody ScoreDTO dto){
		MovieDTO movieDTO = service.saveScore(dto); 
		return movieDTO;
	}	
}
