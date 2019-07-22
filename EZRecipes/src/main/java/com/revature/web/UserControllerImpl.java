package com.revature.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
=======
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
>>>>>>> 698738e061322b43f2a0675ff9bada3371cca0c0
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Ingredient;
import com.revature.service.UserService;
<<<<<<< HEAD

@RestController
@RequestMapping(value = "/api")
public class UserControllerImpl implements UserController {

	private UserService userService;

=======
@RestController
@RequestMapping(value="/user")
public class UserControllerImpl implements UserController {

	private UserService userService;
	
>>>>>>> 698738e061322b43f2a0675ff9bada3371cca0c0
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
<<<<<<< HEAD

	public List<Ingredient> getPantryById(int userid) {
		// TODO Auto-generated method stub
		return null;
=======
	
	@GetMapping(value="/pantry/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Ingredient> getPantryById(@PathVariable("id") int userid) {
		List<Ingredient> pantry = userService.getPantryById(userid);
		return pantry;
>>>>>>> 698738e061322b43f2a0675ff9bada3371cca0c0
	}

}
