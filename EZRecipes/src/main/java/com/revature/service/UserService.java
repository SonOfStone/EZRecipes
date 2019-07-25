package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Ingredient;

public interface UserService {

	List<Ingredient> getPantryById(int userid);
	boolean isValidUser(String username, String password, HttpServletRequest request, HttpServletResponse response );
}
