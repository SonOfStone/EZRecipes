package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Ingredient;
import com.revature.model.User;

public interface UserService {

	List<Ingredient> getPantryById(int userid);
	boolean isValidUser(String username, String password, HttpServletRequest request, HttpServletResponse response);

	void setPantryById(List<Ingredient> pantry, int userid);
	void deletePantryItemById(List<Ingredient> list, int userid);
	Integer isValidUserObj(User user, HttpServletRequest request, HttpServletResponse response);
	User getUserById(int userid);
	boolean registerObj(User user, HttpServletRequest request, HttpServletResponse response);

}
