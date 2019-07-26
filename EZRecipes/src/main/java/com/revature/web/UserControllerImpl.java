package com.revature.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Ingredient;
import com.revature.model.User;
import com.revature.service.UserService;



@RestController
@RequestMapping(value="/user")
public class UserControllerImpl implements UserController {

	private UserService userService;
	private HttpServletResponse response;
	private HttpServletRequest request;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	@GetMapping(value="/pantry/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Ingredient> getPantryById(@PathVariable("id") int userid) {
		List<Ingredient> pantry = userService.getPantryById(userid);
		return pantry;

	}

	@PostMapping(path ="/register", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean register(@RequestBody User user) {
		if(userService.registerObj(user, request, response))
		return true;
		return false;
	}
	@PostMapping(path ="/login", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Integer login(@RequestBody User user) {
		return userService.isValidUserObj(user, request, response);
	}
	
	//returns the appended value
	@PostMapping(value="/pantry/update/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Ingredient postPantry(@PathVariable("id") int userid, @RequestBody Ingredient pantry) {
		List<Ingredient> list = new ArrayList<Ingredient>();
		list.add(pantry);
		
		userService.setPantryById(list, userid);
		//this return is actually just for angular
		return pantry;
	}
	
	@PostMapping(value="/pantry/delete/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Ingredient deletePantryItem(@PathVariable("id") int userid, @RequestBody Ingredient pantry) {
		List<Ingredient> list = new ArrayList<Ingredient>();
		list.add(pantry);
		userService.deletePantryItemById(list, userid);
		
		//this return is actually just for angular
		return pantry;
	}
	
	@GetMapping(value="/{id}")
	public User getUser(@PathVariable("id") int userid) {
		return userService.getUserById(userid);
	}

}
