package com.revature.repository;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.revature.model.meals;
import com.revature.util.SessionFactory;

@Repository("mealsRepo")
public class mealsRepositoryImpl implements mealsRepository {

	public meals getMealbyIdMeal(int idMeal) {
		meals meal = null;
		Session session = null;
		Transaction tx = null;

		try {
			session = SessionFactory.getSession();
			tx = session.beginTransaction();
			meal = session.get(meals.class, idMeal);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return meal;
	}
}
