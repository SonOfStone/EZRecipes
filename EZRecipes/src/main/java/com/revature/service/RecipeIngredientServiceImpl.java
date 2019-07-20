package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.RecipeIngredientRepository;

@Service("recipeIngredientService")
public class RecipeIngredientServiceImpl implements RecipeIngredientService {
	private RecipeIngredientRepository recipeIngredientRepository;

	@Autowired
	public RecipeIngredientServiceImpl(RecipeIngredientRepository recipeIngredientRepository) {
		this.recipeIngredientRepository = recipeIngredientRepository;
	}

	public void setRecipeIngredientRepo(RecipeIngredientRepository recipeIngredientRepository) {
		this.recipeIngredientRepository = recipeIngredientRepository;
	}

}
