package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.Ingredient;
import com.revature.model.User;
import com.revature.util.SessionFactory;


@Repository("userRepo")
public class UserRepositoryImpl implements UserRepository {

	public User getUserByUsername(String username) {
		User user = null;
		Session session = null;
		try {
			session = SessionFactory.getSession();
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
			Root<User> root = criteriaQuery.from(User.class);
			criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("username"), username));
			Query<User> query = session.createQuery(criteriaQuery);
			user = query.getSingleResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		Session session = null;
		try {
			session = SessionFactory.getSession();
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
			Query<User> query = session.createQuery(criteriaQuery);
			users = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return users;
	}

	public User getUserById(int id) {
		User user = null;
		Session session = null;
		Transaction tx = null;

		try {
			session = SessionFactory.getSession();
			tx = session.beginTransaction();
			user = session.get(User.class, id);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return user;
	}

	public void deleteUserById(int id) {
		Session session = null;
		User user;
		try {
			session = SessionFactory.getSession();
			user = (User)session.load(User.class,id);
			session.delete(user);
			session.flush();
		}catch(HibernateException e) {
		e.printStackTrace();
		}finally {
			session.close();
		}
	}

	public void updateUser(User user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = SessionFactory.getSession();
			tx = session.beginTransaction();
			session.merge(user);
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}
	
	public void deleteUser(User user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = SessionFactory.getSession();
			tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}
	
	public void insertUser(User user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = SessionFactory.getSession();
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}
}
