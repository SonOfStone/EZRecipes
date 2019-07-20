package com.revature.repository;

import org.springframework.stereotype.Repository;

import com.revature.model.Pantry;

@Repository("pantryRepo")
public class PantryRepositoryImpl implements PantryRepository {
	public Pantry getPantry(int userid) {
		Pantry pantry = null;
		return pantry;
	}
	
	public void updatePantry(int userid, Pantry inputPantry) {
		
	}
	
	public void insertPantry(Pantry inputPantry) {
		
	}
	
	public void deletePantry(int userid) {
		
	}
}
