package tech.mateuscesar.dsmovie.repositories; //objeto responsavel por buscar os filmes

import org.springframework.data.jpa.repository.JpaRepository;

import tech.mateuscesar.dsmovie.entities.Score;
import tech.mateuscesar.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
