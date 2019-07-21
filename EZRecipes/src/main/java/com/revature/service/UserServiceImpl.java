package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Ingredient;
import com.revature.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	//dependency
	private UserRepository userRepository;

	//constructor injection
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	//setter injection
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<Ingredient> getPantryById(int userid) {
		List<Ingredient> pantry = userRepository.getUserById(userid).getPantry();
		return pantry;
	}

}
