package com.revature.model;

public class Ratings {

private User userId;
private Recipe recipeId;
private double rating;
public Ratings(User userId, Recipe recipeId, double rating) {
	super();
	this.userId = userId;
	this.recipeId = recipeId;
	this.rating = rating;
}
public Ratings() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Ratings [userId=" + userId + ", recipeId=" + recipeId + ", rating=" + rating + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(rating);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((recipeId == null) ? 0 : recipeId.hashCode());
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
	Ratings other = (Ratings) obj;
	if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
		return false;
	if (recipeId == null) {
		if (other.recipeId != null)
			return false;
	} else if (!recipeId.equals(other.recipeId))
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
public Recipe getRecipeId() {
	return recipeId;
}
public void setRecipeId(Recipe recipeId) {
	this.recipeId = recipeId;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
}
