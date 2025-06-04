package com.microservices.microserviceproject.services;

import java.util.List;
import java.util.Optional;

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

	public List<User> getallUsers() {
		List<User> userdata = userRepository.findAll();
//		System.out.println("---servcies--" + userdata);
		return userdata;
	}

	public Optional<User> getUserId(Long id) {
		Optional<User> userdata = userRepository.findById(id);
		System.out.println("---servcies--" + userdata);
		return userdata;
	}
}