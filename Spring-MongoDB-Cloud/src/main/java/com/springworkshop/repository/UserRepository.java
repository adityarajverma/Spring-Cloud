package com.springworkshop.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springworkshop.document.Users;

public interface UserRepository extends MongoRepository<Users, String> {

	public List<Users> findAll();

}
