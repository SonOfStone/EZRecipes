package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Ingredient;
import com.revature.model.User;
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

	public boolean isValidUser(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {
		User user =userRepository.getUserByUsername(username);
		if(user.getPassword()==password) {
			request.setAttribute("userid", user.getUserId());
			return true;
		}
		return false;
	}

}
