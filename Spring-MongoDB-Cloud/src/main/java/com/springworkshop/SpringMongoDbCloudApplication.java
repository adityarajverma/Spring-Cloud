package com.springworkshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springworkshop.document.Users;
import com.springworkshop.repository.UserRepository;

@SpringBootApplication
public class SpringMongoDbCloudApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbCloudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(userRepository.findAll());

		Users u1 = new Users("1", "Umesh", "Noida", "UP", "India");
		userRepository.save(u1);

	}

}
