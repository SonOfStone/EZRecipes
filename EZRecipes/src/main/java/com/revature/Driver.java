package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = context.getBean("userService2", UserServiceImpl.class);
		
		System.out.println(userService.getPantryById(1));
	}
}
