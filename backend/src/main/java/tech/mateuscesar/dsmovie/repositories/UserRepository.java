package tech.mateuscesar.dsmovie.repositories; //objeto responsavel por buscar os filmes

import org.springframework.data.jpa.repository.JpaRepository;

import tech.mateuscesar.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
