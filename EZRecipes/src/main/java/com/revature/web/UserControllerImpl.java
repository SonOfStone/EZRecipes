package com.revature.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Ingredient;
import com.revature.service.UserService;

@RestController
@RequestMapping(value = "/api")
public class UserControllerImpl implements UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<Ingredient> getPantryById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
