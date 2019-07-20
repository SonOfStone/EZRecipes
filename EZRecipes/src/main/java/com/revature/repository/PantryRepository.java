package com.revature.repository;

import com.revature.model.Pantry;

public interface PantryRepository {
	Pantry getPantry(int userid);
	void updatePantry(int userid, Pantry inputPantry);
	void insertPantry(Pantry inputPantry);
	void deletePantry(int userid);
}
