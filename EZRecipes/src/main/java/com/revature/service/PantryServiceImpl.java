package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.PantryRepository;

@Service("pantryService")
public class PantryServiceImpl implements PantryService {
	private PantryRepository pantryRepository;

	@Autowired
	public PantryServiceImpl(PantryRepository pantryRepository) {
		this.pantryRepository = pantryRepository;
	}
	public void setPantryRepo(PantryRepository pantryRepository) {
		this.pantryRepository=pantryRepository;
	}

}
