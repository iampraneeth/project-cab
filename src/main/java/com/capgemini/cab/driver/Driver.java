package com.capgemini.cab.driver;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

	@Id
	private long number;
	private String name;
	private String email;
	private String dob;
	private String license;
	private String vehicle_registration;
	private String vehicle_inspection_report;
	private String police_report;
	private int ownerId;
	private String password;

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(String name, long number, String email, String dob, String license, String vehicle_registration,
			String vehicle_inspection_report, String police_report, int ownerId, String password) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.dob = dob;
		this.license = license;
		this.vehicle_registration = vehicle_registration;
		this.vehicle_inspection_report = vehicle_inspection_report;
		this.police_report = police_report;
		this.ownerId = ownerId;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getVehicle_registration() {
		return vehicle_registration;
	}

	public void setVehicle_registration(String vehicle_registration) {
		this.vehicle_registration = vehicle_registration;
	}

	public String getVehicle_inspection_report() {
		return vehicle_inspection_report;
	}

	public void setVehicle_inspection_report(String vehicle_inspection_report) {
		this.vehicle_inspection_report = vehicle_inspection_report;
	}

	public String getPolice_report() {
		return police_report;
	}

	public void setPolice_report(String police_report) {
		this.police_report = police_report;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", number=" + number + ", email=" + email + ", dob=" + dob + ", license="
				+ license + ", vehicle_registration=" + vehicle_registration + ", vehicle_inspection_report="
				+ vehicle_inspection_report + ", police_report=" + police_report + ", ownerId=" + ownerId
				+ ", password=" + password + "]";
	}

}
