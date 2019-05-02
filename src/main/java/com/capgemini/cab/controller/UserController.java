package com.capgemini.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cab.dao.UserDao;
import com.capgemini.cab.distance.GFG;
import com.capgemini.cab.driver.Driver;
import com.capgemini.cab.service.UserService;
import com.capgemini.cab.user.User;

@RestController
public class UserController {
	@Autowired
	private UserDao dao;
	@Autowired
	private UserService service;

	@RequestMapping("/signupuser")
	public void signUpDetailsOfUser(@RequestParam("name") String name, @RequestParam("password") String password,
			@RequestParam("mobileNumber") long mobileNumber, @RequestParam("email") String email) {
		// User user = new User("Ram", "password", 1234567891, "ram@gmail.com");
		User user = new User(name, password, mobileNumber, email);
		service.addDetails(user);

	}

	@RequestMapping("/loginuser")
	public String logInDetailsForUser(/*
										 * @RequestParam("email") String email, @RequestParam("password") String
										 * password
										 */) {
		long no=123456781;
		String email = "ram1@gmail.com";
		String password = "password";
		User user = dao.findById("Ram").get();
		//Long number = Long.parseLong(email);

		if ((user.getEmail().equals(email) || user.getNumber() == no) && user.getPassword().equals(password)) {
			return "yes";
		}

		else {
			return "no";
		}
	}

	@RequestMapping("/pickupride")
	public String pickUpRide(/*
								 * @RequestParam("pickUpFrom") String pickUpFrom,@RequestParam("dropAt") String
								 * dropAt
								 */) {
		GFG gfg = new GFG();
		double distance = gfg.distance(19.0760, 18.5204, 72.8777, 73.8567);
		double fare = distance * 10;
		String dist1 = Double.toString(distance);
		String fare1 = Double.toString(fare);
		String distfare = "distance is\n" + dist1 + "\n fare is" + fare1;
		return distfare;

	}

	@RequestMapping("/confirmride")
	public String confrimRide() {
		Driver driver = new Driver();

		return null;

	}

}
