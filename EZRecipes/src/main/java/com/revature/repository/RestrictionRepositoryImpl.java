package com.revature.repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.model.Restriction;
import com.revature.util.SessionFactory;

public class RestrictionRepositoryImpl implements RestrictionRepository{

	public Restriction getRestrictionsByUserId(int id) {
		Restriction restriction = null;
		Session session = null;
		try {
			session = SessionFactory.getSession();
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<Restriction> criteriaQuery = criteriaBuilder.createQuery(Restriction.class);
			Root<Restriction> root = criteriaQuery.from(Restriction.class);
			criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("userid"), id));
			Query<Restriction> query = session.createQuery(criteriaQuery);
			restriction=query.getSingleResult();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return restriction;
	}

}
