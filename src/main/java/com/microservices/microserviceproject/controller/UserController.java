package com.microservices.microserviceproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.microserviceproject.entites.User;
import com.microservices.microserviceproject.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService; 

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.createUser(user));
	}
}