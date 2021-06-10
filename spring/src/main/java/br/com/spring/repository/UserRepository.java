package br.com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
