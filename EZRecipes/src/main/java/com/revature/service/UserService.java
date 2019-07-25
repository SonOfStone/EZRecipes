package com.revature.service;

import java.util.List;

import com.revature.model.Ingredient;

public interface UserService {

	List<Ingredient> getPantryById(int userid);
	void setPantryById(List<Ingredient> pantry, int userid);
	void deletePantryItemById(List<Ingredient> list, int userid);

}
