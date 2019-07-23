package com.revature.model;

public class Rating {

private User userId;
private meals mealsId;
private double rating;
public Rating(User userId, meals mealsId, double rating) {
	super();
	this.userId = userId;
	this.mealsId = mealsId;
	this.rating = rating;
}
public Rating() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Rating [userId=" + userId + ", mealsId=" + mealsId + ", rating=" + rating + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((mealsId == null) ? 0 : mealsId.hashCode());
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
	if (mealsId == null) {
		if (other.mealsId != null)
			return false;
	} else if (!mealsId.equals(other.mealsId))
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
public meals getMealsId() {
	return mealsId;
}
public void setMealsId(meals mealsId) {
	this.mealsId = mealsId;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;

}
}