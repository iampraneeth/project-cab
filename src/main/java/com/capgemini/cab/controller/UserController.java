package com.capgemini.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cab.dao.UserDao;
import com.capgemini.cab.service.UserService;
import com.capgemini.cab.user.User;

@RestController
public class UserController {
	@Autowired
	private UserDao dao;
	@Autowired
	private UserService service;

	@RequestMapping("/signupuser")
	public void signUpDetailsOfUser() {
		User user = new User("Ram", "password", 1234567891, "ram@gmail.com");
		service.addDetails(user);

	}

	@RequestMapping("/displayuser")
	public User showDetailsOfUser() {
		User user = dao.findById("Ram").get();
		return user;

	}

}
