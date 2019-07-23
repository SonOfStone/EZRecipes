package com.revature.web;

import java.util.List;

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
import com.revature.service.UserService;
@RestController
@RequestMapping(value="/user")
public class UserControllerImpl implements UserController {

	private UserService userService;
	
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
	
	@PostMapping(value="/pantry/update", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void postPantry(@RequestBody List<Ingredient> pantry, @RequestBody int userid) {
		userService.setPantryById(pantry, userid);
	}

}
