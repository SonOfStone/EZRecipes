package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.mealsRepositoryImpl;

@Service("mealsService")
public class mealsServiceImpl implements mealsService {
	private mealsRepositoryImpl mealsRepository;

	@Autowired
	public mealsServiceImpl(mealsRepositoryImpl mealsRepositoryImpl) {

		this.mealsRepository = mealsRepositoryImpl;
	}

}
