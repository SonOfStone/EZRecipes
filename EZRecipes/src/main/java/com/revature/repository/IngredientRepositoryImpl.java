package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.revature.model.Ingredient;
import com.revature.util.SessionFactory;

@Repository("ingredientRepo")
public class IngredientRepositoryImpl implements IngredientRepository {
	public List<Ingredient> getAllIngredients() {
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		Session session = null;
		Transaction tx = null;
		try {
			session = SessionFactory.getSession();
			tx = session.beginTransaction();
			ingredients = session.createQuery("From Ingredient", Ingredient.class).getResultList();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return ingredients;
	}
}
