package com.revature.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="favorites", schema="ezrecipes")
public class Favorite {
private User userId;
private meals mealsId;
private String lastAccessed;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((lastAccessed == null) ? 0 : lastAccessed.hashCode());
	result = prime * result + ((mealsId == null) ? 0 : mealsId.hashCode());
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
	Favorite other = (Favorite) obj;
	if (lastAccessed == null) {
		if (other.lastAccessed != null)
			return false;
	} else if (!lastAccessed.equals(other.lastAccessed))
		return false;
	if (mealsId == null) {
		if (other.mealsId != null)
			return false;
	} else if (!mealsId.equals(other.mealsId))
		return false;
	if (userId == null) {
		if (other.userId != null)
			return false;
	} else if (!userId.equals(other.userId))
		return false;
	return true;
}
@Override
public String toString() {
	return "UserRecipe [userId=" + userId + ", recipeId=" + mealsId + ", lastAccessed=" + lastAccessed + "]";
}
public User getUserId() {
	return userId;
}
public void setUserId(User userId) {
	this.userId = userId;
}
public meals getRecipeId() {
	return mealsId;
}
public void setRecipeId(meals recipeId) {
	this.mealsId = recipeId;
}
public String getLastAccessed() {
	return lastAccessed;
}
public void setLastAccessed(String lastAccessed) {
	this.lastAccessed = lastAccessed;
}
public Favorite(User userId, meals recipeId, String lastAccessed) {
	super();
	this.userId = userId;
	this.mealsId = mealsId;
	this.lastAccessed = lastAccessed;
}
public Favorite() {
	super();
	// TODO Auto-generated constructor stub
}

}
