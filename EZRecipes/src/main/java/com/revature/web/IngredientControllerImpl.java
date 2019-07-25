package com.revature.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Ingredient;
import com.revature.service.IngredientService;

@RestController
@RequestMapping(value="/ingredient")
public class IngredientControllerImpl implements IngredientController {
	private IngredientService ingredientService;
	
	@Autowired
	public void setIngredientService(IngredientService ingredientService) {
		this.ingredientService = ingredientService;
	}
	
	@GetMapping(value="/all", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Ingredient> getAllIngredients() {
		List<Ingredient> pantry = ingredientService.getAllIngredients();
		return pantry;
	}
	
}
