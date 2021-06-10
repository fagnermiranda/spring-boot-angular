package br.com.spring.service;

import org.springframework.stereotype.Service;

import br.com.spring.core.service.CrudService;
import br.com.spring.model.User;

@Service
public class UserService extends CrudService<User, Long> {

}
