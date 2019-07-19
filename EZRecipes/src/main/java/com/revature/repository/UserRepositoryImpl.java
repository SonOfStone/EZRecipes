package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.model.User;
import com.revature.util.SessionFactory;

public class UserRepositoryImpl implements UserRepository{

	public User getUserByUsername(String username) {
		User user = null;
		Session session = null;
		try {
			session= SessionFactory.getSession();
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
			Root<User> root = criteriaQuery.from(User.class);
			criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("username"), username));
			Query<User> query = session.createQuery(criteriaQuery);
			user=query.getSingleResult();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return user;
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		Session session = null;
		try {
			session=SessionFactory.getSession();
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
			Query<User> query= session.createQuery(criteriaQuery);
			users = query.list();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return users;
	}

	public User getUserById(int id) {
		User user = null;
		Session session = null;
		try {
			session= SessionFactory.getSession();
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
			Root<User> root = criteriaQuery.from(User.class);
			criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("userid"), id));
			Query<User> query = session.createQuery(criteriaQuery);
			user=query.getSingleResult();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return user;
	}

}
