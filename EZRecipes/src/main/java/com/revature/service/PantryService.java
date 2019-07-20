package com.revature.service;

import com.revature.model.Pantry;

public interface PantryService {
	Pantry getPantry(int userid);
	void updatePantry(int userid, Pantry inputPantry);
	void insertPantry(Pantry inputPantry);
	void deletePantry(int userid);
}
