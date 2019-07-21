package com.revature.web;

import java.util.List;

import com.revature.model.Ingredient;

public interface UserController {
	public List<Ingredient> getPantryById(int userid);
}
