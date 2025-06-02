package com.microservices.microserviceproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.microserviceproject.entites.User;
import com.microservices.microserviceproject.repository.UserRepository;

@Service
public class UserService {
 
	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}
}