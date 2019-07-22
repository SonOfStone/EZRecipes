package com.revature.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "ezrecipes")
public class User {
	@Id
	@Column(name = "userid")
	private int userId;
	@Column(name = "first")
	private String first;
	@Column(name = "last")
	private String last;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "restrictionid")
	private Restriction restrictions;

	// throwing this in here because I think it belongs
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(schema = "ezrecipes", name = "pantry", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "ingredientid"))
	private List<Ingredient> pantry;

	public User(int userId, String first, String last, String username, String password, Restriction restrictions,
			List<Ingredient> pantry) {
		super();
		this.userId = userId;
		this.first = first;
		this.last = last;
		this.username = username;
		this.password = password;
		this.restrictions = restrictions;
		this.pantry = pantry;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", first=" + first + ", last=" + last + ", username=" + username
				+ ", password=" + password + ", restrictions=" + restrictions + ", pantry=" + pantry + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		result = prime * result + ((pantry == null) ? 0 : pantry.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((restrictions == null) ? 0 : restrictions.hashCode());
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
		if (pantry == null) {
			if (other.pantry != null)
				return false;
		} else if (!pantry.equals(other.pantry))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (restrictions == null) {
			if (other.restrictions != null)
				return false;
		} else if (!restrictions.equals(other.restrictions))
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

	public Restriction getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(Restriction restrictions) {
		this.restrictions = restrictions;
	}

	public List<Ingredient> getPantry() {
		return pantry;
	}

	public void setPantry(List<Ingredient> pantry) {
		this.pantry = pantry;
	}
}
