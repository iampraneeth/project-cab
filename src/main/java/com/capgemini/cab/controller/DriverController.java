package com.capgemini.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cab.dao.DriverDao;
import com.capgemini.cab.driver.Driver;
import com.capgemini.cab.service.DriverService;

@RestController
public class DriverController {
	@Autowired
	private DriverDao dao;
	@Autowired
	private DriverService service;

	@RequestMapping("/signupdriver")
	public void signUpDetailsOfDetails() {
		Driver driver = new Driver("mrunal", 898989898, "mrunal@gmail.com", "1221997", "ABC123", "MH02-2121", "GOOD",
				"GOOD", 101, "password");
		service.addDetailsOfDriver(driver);
	}
	@RequestMapping("/logindriver")
	public String loginDriver() {
		
		return null;
		
		
	}
	
}
