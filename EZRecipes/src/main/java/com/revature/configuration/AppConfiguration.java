package com.revature.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import com.revature.repository.FavoriteRepository;
import com.revature.repository.FavoriteRepositoryImpl;
import com.revature.repository.IngredientRepository;
import com.revature.repository.IngredientRepositoryImpl;
import com.revature.repository.RatingRepository;
import com.revature.repository.RatingRepositoryImpl;
import com.revature.repository.RecipeIngredientRepository;
import com.revature.repository.RecipeIngredientRepositoryImpl;
import com.revature.repository.RestrictionRepository;
import com.revature.repository.RestrictionRepositoryImpl;
import com.revature.repository.UserRepository;
import com.revature.repository.UserRepositoryImpl;
import com.revature.repository.mealsRepository;
import com.revature.repository.mealsRepositoryImpl;
import com.revature.service.FavoriteService;
import com.revature.service.FavoriteServiceImpl;
import com.revature.service.IngredientService;
import com.revature.service.IngredientServiceImpl;
import com.revature.service.RatingService;
import com.revature.service.RatingServiceImpl;
import com.revature.service.RecipeIngredientService;
import com.revature.service.RecipeIngredientServiceImpl;
import com.revature.service.RestrictionService;
import com.revature.service.RestrictionServiceImpl;
import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;
import com.revature.service.mealsService;
import com.revature.service.mealsServiceImpl;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AppConfiguration {

	@Bean(value = "favoriteRepo")
	@Scope(scopeName = "singleton")
	public FavoriteRepository getFavoriteRepository() {
		return new FavoriteRepositoryImpl();
	}

	@Bean(value = "favoriteService")
	@Scope(scopeName = "singleton")
	public FavoriteService getFavoriteService() {
		return new FavoriteServiceImpl(new FavoriteRepositoryImpl());
	}

	@Bean(value = "ingredientRepo")
	@Scope(scopeName = "singleton")
	public IngredientRepository getIngredientRepository() {
		return new IngredientRepositoryImpl();
	}

	@Bean(value = "ingredientService")
	@Scope(scopeName = "singleton")
	public IngredientService getIngredientService() {
		return new IngredientServiceImpl( new IngredientRepositoryImpl());
	}
	
	@Bean(value = "ratingRepo")
	@Scope(scopeName = "singleton")
	public RatingRepository getRatingRepository() {
		return new RatingRepositoryImpl();
	}
	@Bean(value = "ratingService")
	@Scope(scopeName = "singleton")
	public RatingService getRatingService() {
		return new RatingServiceImpl(new RatingRepositoryImpl());
	}
	@Bean(value = "recipeIngredientRepo")
	@Scope(scopeName = "singleton")
	public RecipeIngredientRepository getRecipeIngredientRepository() {
		return new RecipeIngredientRepositoryImpl();
	}
	@Bean(value = "recipeIngredientService")
	@Scope(scopeName = "singleton")
	public RecipeIngredientService getRecipeIngredientService() {
		return new RecipeIngredientServiceImpl(new RecipeIngredientRepositoryImpl());
	}
	@Bean(value = "mealsRepo")
	@Scope(scopeName = "singleton")
	public mealsRepository getmealsRepository() {
		return new mealsRepositoryImpl();
	}
	@Bean(value = "mealsService")
	@Scope(scopeName = "singleton")
	public mealsService getmealsService() {
		return new mealsServiceImpl( new mealsRepositoryImpl() );
	}
	@Bean(value = "restrictionRepo")
	@Scope(scopeName = "singleton")
	public RestrictionRepository getRestrictionRepository() {
		return new RestrictionRepositoryImpl();
	}
	@Bean(value = "restrictionService")
	@Scope(scopeName = "singleton")
	public RestrictionService getRestrictionService() {
		return new RestrictionServiceImpl(new RestrictionRepositoryImpl());
	}
	@Bean(value = "userRepo")
	@Scope(scopeName = "singleton")
	public UserRepository getUserRepository() {
		return new UserRepositoryImpl();
	}

	@Bean(value = "userService")
	@Scope(scopeName = "singleton")
	public UserService getUserService() {
		return new UserServiceImpl(new UserRepositoryImpl());
	}
}
