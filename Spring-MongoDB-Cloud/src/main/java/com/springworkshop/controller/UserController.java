package com.springworkshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springworkshop.document.Users;
import com.springworkshop.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/get")
	public List<Users> returnUsersData() {

		return userRepository.findAll();

	}

}
