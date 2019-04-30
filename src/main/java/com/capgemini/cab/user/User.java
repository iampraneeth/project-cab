package com.capgemini.cab.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String username;
	private String password;
	private long number;
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, long number, String email) {
		super();
		this.username = username;
		this.password = password;
		this.number = number;
		this.email = email;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", number=" + number + ", email=" + email
				+ "]";
	}

}