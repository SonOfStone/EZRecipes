package com.revature.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="favorites", schema="ezrecipes")
public class Favorite {
private User userId;
private Recipe recipeId;
private String lastAccessed;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((lastAccessed == null) ? 0 : lastAccessed.hashCode());
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
	Favorite other = (Favorite) obj;
	if (lastAccessed == null) {
		if (other.lastAccessed != null)
			return false;
	} else if (!lastAccessed.equals(other.lastAccessed))
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
@Override
public String toString() {
	return "UserRecipe [userId=" + userId + ", recipeId=" + recipeId + ", lastAccessed=" + lastAccessed + "]";
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
public String getLastAccessed() {
	return lastAccessed;
}
public void setLastAccessed(String lastAccessed) {
	this.lastAccessed = lastAccessed;
}
public Favorite(User userId, Recipe recipeId, String lastAccessed) {
	super();
	this.userId = userId;
	this.recipeId = recipeId;
	this.lastAccessed = lastAccessed;
}
public Favorite() {
	super();
	// TODO Auto-generated constructor stub
}

}
