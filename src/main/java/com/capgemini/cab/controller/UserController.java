package com.capgemini.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cab.dao.UserDao;
import com.capgemini.cab.distance.GFG;
import com.capgemini.cab.driver.Driver;
import com.capgemini.cab.service.UserService;
import com.capgemini.cab.user.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class UserController {
	@Autowired
	private UserDao dao;
	@Autowired
	private UserService service;
	

	@PostMapping("/signUp")
	public ResponseEntity<User> signUpDetailsOfUser(@RequestBody User user) {
		// User user = new User("Ram", "password", 1234567891, "ram@gmail.com");
		// User user = new User(name, password, mobileNumber, email);
		System.out.println(user);
		User u = service.addDetails(user);
		System.out.println(u);

		return new ResponseEntity<User>(u, HttpStatus.CREATED);

	}

	@RequestMapping("/loginuser")
	public String logInDetailsForUser(/*
										 * @RequestParam("email") String email, @RequestParam("password") String
										 * password
										 */) {
		long no = 123456781;
		String email = "ram1@gmail.com";
		String password = "password";
		User user = dao.findById(1L).get();
		// Long number = Long.parseLong(email);

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
