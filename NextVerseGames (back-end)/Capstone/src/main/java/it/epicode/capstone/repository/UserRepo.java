package it.epicode.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.auth.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	boolean existsByEmail(String email);
	

}
