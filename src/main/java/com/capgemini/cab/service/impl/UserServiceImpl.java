package com.capgemini.cab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.cab.dao.UserDao;
import com.capgemini.cab.service.UserService;
import com.capgemini.cab.user.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao udao;
	

	@Override
	public User addDetails(User user) {
		return udao.save(user);
		
	}


	
}
