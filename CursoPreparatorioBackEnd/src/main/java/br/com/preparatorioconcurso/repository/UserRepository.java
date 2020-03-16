package br.com.preparatorioconcurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.preparatorioconcurso.model.User;


@Repository
@Transactional(propagation = Propagation.REQUIRED)
public interface UserRepository extends JpaRepository<User, Long> {
	
	/* @Query("SELECT u from User u") */
	public User buscaUsuario();
	
	
}
