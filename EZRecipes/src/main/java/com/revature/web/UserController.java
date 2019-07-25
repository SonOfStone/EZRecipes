package com.revature.web;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.revature.model.Ingredient;

public interface UserController {
	public List<Ingredient> getPantryById(int userid);
	//public void postPantry(Ingredient pantry, int userid);
}
