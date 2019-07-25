package com.revature.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Ingredient;
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
	@PostMapping(path ="/login/", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean login(@RequestParam(value="login[]") String[] userCredientials) {
		if(userService.isValidUser(userCredientials[0], userCredientials[1], request, response)) {
			
			return true;
		}
		return false;
		
	}

}
