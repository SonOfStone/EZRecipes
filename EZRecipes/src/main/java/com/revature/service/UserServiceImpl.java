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


	//returns a list of ingredients given a userid
	public List<Ingredient> getPantryById(int userid) {
		List<Ingredient> pantry = userRepository.getUserById(userid).getPantry();
		return pantry;
	}
	
	//sets the current pantry given a list of ingredients and a user id
	public void setPantryById(List<Ingredient> pantry, int userid) {
		User user = userRepository.getUserById(userid);
		List<Ingredient> oldPantry = user.getPantry();
		//add the new ingredients to the old list
		for(Ingredient ingredient: pantry) {
			oldPantry.add(ingredient);
		}
		//add it to the user
		user.setPantry(oldPantry);
		
		userRepository.updateUser(user);
	}
	
	//sets the current pantry given a list of ingredients and a user id
	//this will break given more than one item in the pantry
	public void deletePantryItemById(List<Ingredient> pantry, int userid) {
		User user = userRepository.getUserById(userid);
		List<Ingredient> oldPantry = user.getPantry();
		//add the new ingredients to the old list
		for(Ingredient ingredient: pantry) {
			for(int i=0; i < oldPantry.size(); i++) {
				if(ingredient.getIngredientId() == oldPantry.get(i).getIngredientId()) {
					oldPantry.remove(i);
				}
			}
		}
		
		//add it to the user
		user.setPantry(oldPantry);
		userRepository.updateUser(user);
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
