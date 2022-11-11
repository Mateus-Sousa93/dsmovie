package tech.mateuscesar.dsmovie.repositories; //objeto responsavel por buscar os filmes

import org.springframework.data.jpa.repository.JpaRepository;

import tech.mateuscesar.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
