package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Pantry;
import com.revature.repository.PantryRepository;

@Service("pantryService")
public class PantryServiceImpl implements PantryService {
	
	//start of spring
	private PantryRepository pantryRepository;

	@Autowired
	public PantryServiceImpl(PantryRepository pantryRepository) {
		this.pantryRepository = pantryRepository;
	}
	public void setPantryRepo(PantryRepository pantryRepository) {
		this.pantryRepository = pantryRepository;
	}

	//end of spring
	
	//start of methods
	public Pantry getPantry(int userid) {
		Pantry pantry = pantryRepository.getPantry(userid);
		return pantry;
	}
	
	public void updatePantry(int userid, Pantry inputPantry) {
		pantryRepository.updatePantry(userid, inputPantry);
	}
	
	public void insertPantry(Pantry inputPantry) {
		pantryRepository.insertPantry(inputPantry);
	}
	
	public void deletePantry(int userid) {
		pantryRepository.deletePantry(userid);
	}
}
