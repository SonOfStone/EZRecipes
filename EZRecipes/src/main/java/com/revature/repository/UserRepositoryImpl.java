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
		Session s = null;
		try {
			s= SessionFactory.getSession();
			CriteriaBuilder cb = s.getCriteriaBuilder();
			CriteriaQuery<User> cq = cb.createQuery(User.class);
			Root<User> root = cq.from(User.class);
			cq.select(root).where(cb.equal(root.get("username"), username));
			Query<User> q = s.createQuery(cq);
			user=q.getSingleResult();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			s.close();
		}
		return user;
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		Session s = null;
		try {
			s=SessionFactory.getSession();
			CriteriaBuilder cb = s.getCriteriaBuilder();
			CriteriaQuery<User> cq = cb.createQuery(User.class);
			Query<User> q= s.createQuery(cq);
			users = q.list();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			s.close();
		}
		return users;
	}

	public User getUserById(int id) {
		User user = null;
		Session s = null;
		try {
			s= SessionFactory.getSession();
			CriteriaBuilder cb = s.getCriteriaBuilder();
			CriteriaQuery<User> cq = cb.createQuery(User.class);
			Root<User> root = cq.from(User.class);
			cq.select(root).where(cb.equal(root.get("userid"), id));
			Query<User> q = s.createQuery(cq);
			user=q.getSingleResult();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			s.close();
		}
		return user;
	}

}
