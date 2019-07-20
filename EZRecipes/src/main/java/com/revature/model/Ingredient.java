package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ingredients", schema="ezrecipes")
public class Ingredient {
@Id
@Column(name="ingredientid")
private int ingredientId;
@Column(name="name")
private String name;

public Ingredient() {
	super();
	// TODO Auto-generated constructor stub
}

public Ingredient(int ingredientId, String name) {
	super();
	this.ingredientId = ingredientId;
	this.name = name;
}
public int getIngredientId() {
	return ingredientId;
}
public void setIngredientId(int ingredientId) {
	this.ingredientId = ingredientId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Ingredient [ingredientId=" + ingredientId + ", name=" + name + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ingredientId;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	Ingredient other = (Ingredient) obj;
	if (ingredientId != other.ingredientId)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
}
