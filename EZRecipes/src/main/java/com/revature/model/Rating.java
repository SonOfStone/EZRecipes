package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

//@Entity
//@Table(name = "ratings", schema = "ezrecipes")
public class Rating {
//	@Id
//	@Column(name = "userId")
	private User userId;
//	@Column(name = "idMeals")
	private meals idMeals;
//	@Column(name = "rating")
	private double rating;

	public Rating(User userId, meals idMeals, double rating) {
		super();
		this.userId = userId;
		this.idMeals = idMeals;
		this.rating = rating;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", idMeals=" + idMeals + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMeals == null) ? 0 : idMeals.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rating other = (Rating) obj;
		if (idMeals == null) {
			if (other.idMeals != null)
				return false;
		} else if (!idMeals.equals(other.idMeals))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public meals getIdMeals() {
		return idMeals;
	}

	public void setIdMeals(meals idMeals) {
		this.idMeals = idMeals;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;

	}
}
