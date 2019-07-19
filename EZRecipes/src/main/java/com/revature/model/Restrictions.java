package com.revature.model;

public class Restrictions {
private int restrictionId;
private boolean dairy;
private boolean vegetarian;
private boolean vegan;
private boolean gluten;
private boolean nuts;
public Restrictions(int restrictionId, boolean dairy, boolean vegetarian, boolean vegan, boolean gluten, boolean nuts) {
	super();
	this.restrictionId = restrictionId;
	this.dairy = dairy;
	this.vegetarian = vegetarian;
	this.vegan = vegan;
	this.gluten = gluten;
	this.nuts = nuts;
}
public Restrictions() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Restrictions [restrictionId=" + restrictionId + ", dairy=" + dairy + ", vegetarian=" + vegetarian
			+ ", vegan=" + vegan + ", gluten=" + gluten + ", nuts=" + nuts + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (dairy ? 1231 : 1237);
	result = prime * result + (gluten ? 1231 : 1237);
	result = prime * result + (nuts ? 1231 : 1237);
	result = prime * result + restrictionId;
	result = prime * result + (vegan ? 1231 : 1237);
	result = prime * result + (vegetarian ? 1231 : 1237);
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
	Restrictions other = (Restrictions) obj;
	if (dairy != other.dairy)
		return false;
	if (gluten != other.gluten)
		return false;
	if (nuts != other.nuts)
		return false;
	if (restrictionId != other.restrictionId)
		return false;
	if (vegan != other.vegan)
		return false;
	if (vegetarian != other.vegetarian)
		return false;
	return true;
}
public int getRestrictionId() {
	return restrictionId;
}
public void setRestrictionId(int restrictionId) {
	this.restrictionId = restrictionId;
}
public boolean isDairy() {
	return dairy;
}
public void setDairy(boolean dairy) {
	this.dairy = dairy;
}
public boolean isVegetarian() {
	return vegetarian;
}
public void setVegetarian(boolean vegetarian) {
	this.vegetarian = vegetarian;
}
public boolean isVegan() {
	return vegan;
}
public void setVegan(boolean vegan) {
	this.vegan = vegan;
}
public boolean isGluten() {
	return gluten;
}
public void setGluten(boolean gluten) {
	this.gluten = gluten;
}
public boolean isNuts() {
	return nuts;
}
public void setNuts(boolean nuts) {
	this.nuts = nuts;
}
}
