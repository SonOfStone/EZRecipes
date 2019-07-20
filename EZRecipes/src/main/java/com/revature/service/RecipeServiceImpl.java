package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.RecipeRepository;

@Service("recipeService")
public class RecipeServiceImpl implements RecipeService {
	private RecipeRepository recipeRepository;

	@Autowired
	public RecipeServiceImpl(RecipeRepository recipeRepository) {

		this.recipeRepository = recipeRepository;
	}

	public void setRecipeRepo(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

}
