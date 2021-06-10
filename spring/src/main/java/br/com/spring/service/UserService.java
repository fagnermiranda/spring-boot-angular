package br.com.spring.service;

import org.springframework.stereotype.Service;

import br.com.spring.core.service.AbstractService;
import br.com.spring.model.User;

@Service
public class UserService extends AbstractService<User, Long> {

}
