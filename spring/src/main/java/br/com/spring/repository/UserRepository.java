package br.com.spring.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.spring.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
}
