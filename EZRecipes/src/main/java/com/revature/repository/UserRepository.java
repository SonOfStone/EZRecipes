package com.revature.repository;

import java.util.List;

import com.revature.model.User;

public interface UserRepository {
	User getUserByUsername(String username);
	List<User> getAllUsers();
	User getUserById(int id);
	void deleteUserById(int id);
}
