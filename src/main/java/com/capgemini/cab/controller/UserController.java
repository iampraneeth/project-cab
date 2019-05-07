package com.capgemini.cab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	User user = new User();

	@PostMapping("/signUp")
	public ResponseEntity<User> signUpDetailsOfUser(@RequestBody User user) {
		// System.out.println(user.getEmail());
		User u = service.addDetails(user);
		System.out.println(u);

		return new ResponseEntity<User>(u, HttpStatus.CREATED);

	}

	/*
	 * @RequestMapping("/loginuser") public ResponseEntity<User>
	 * logInDetailsForUser(@RequestParam("email") String email,
	 * 
	 * @RequestParam("password") String password) { User find =
	 * service.findByEmail(email); System.out.println(find);
	 * 
	 * if ((find.getEmail().equals(email)) && (find.getPassword().equals(password)))
	 * { System.out.println(find.getEmail()); return new ResponseEntity<User>(find,
	 * HttpStatus.ACCEPTED); }
	 * 
	 * else { return new ResponseEntity<User>(HttpStatus.NOT_FOUND); } }
	 */
	@GetMapping("/loginuser/{email}/{password}")
	public ResponseEntity<User> logInDetailsForUser(@PathVariable String email, @PathVariable String password)
			throws NullPointerException {

		User user1 = service.findByEmail(email);
		System.out.println(user1);
		System.out.println(email);
		System.out.println(password);
		System.out.println(user1.getEmail());
		System.out.println(user1.getPassword());

		if ((user1.getEmail().equals(email) && (user1.getPassword().equals(password)))) {

			return new ResponseEntity<User>(user1, HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);

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
