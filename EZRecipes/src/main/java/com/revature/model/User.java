package com.revature.model;

public class User {
private int userId;
private String first;
private String last;
private String username;
private String password;
private int restrictionId;
public User(int userId, String first, String last, String username, String password, int restrictionId) {
	super();
	this.userId = userId;
	this.first = first;
	this.last = last;
	this.username = username;
	this.password = password;
	this.restrictionId = restrictionId;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [userId=" + userId + ", first=" + first + ", last=" + last + ", username=" + username + ", password="
			+ password + ", restrictionId=" + restrictionId + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((first == null) ? 0 : first.hashCode());
	result = prime * result + ((last == null) ? 0 : last.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + restrictionId;
	result = prime * result + userId;
	result = prime * result + ((username == null) ? 0 : username.hashCode());
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
	User other = (User) obj;
	if (first == null) {
		if (other.first != null)
			return false;
	} else if (!first.equals(other.first))
		return false;
	if (last == null) {
		if (other.last != null)
			return false;
	} else if (!last.equals(other.last))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (restrictionId != other.restrictionId)
		return false;
	if (userId != other.userId)
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFirst() {
	return first;
}
public void setFirst(String first) {
	this.first = first;
}
public String getLast() {
	return last;
}
public void setLast(String last) {
	this.last = last;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getRestrictionId() {
	return restrictionId;
}
public void setRestrictionId(int restrictionId) {
	this.restrictionId = restrictionId;
}
}
