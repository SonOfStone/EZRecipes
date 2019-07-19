package com.revature.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.repository.UserRepository;
import com.revature.repository.UserRepositoryImpl;

@Configuration
public class AppConfiguration {

@Bean(value="userRepo")
@Scope(scopeName="singleton")
public UserRepository getUserRepository() {
	return new UserRepositoryImpl();
}
}
