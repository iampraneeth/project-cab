package com.capgemini.cab.service;

import org.springframework.stereotype.Service;

import com.capgemini.cab.driver.Driver;

@Service
public interface DriverService {
	public void addDetailsOfDriver(Driver driver);

}
