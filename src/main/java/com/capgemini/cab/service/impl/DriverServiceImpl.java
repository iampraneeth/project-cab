package com.capgemini.cab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.cab.dao.DriverDao;
import com.capgemini.cab.driver.Driver;
import com.capgemini.cab.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
	@Autowired
	private DriverDao ddao;

	@Override
	public void addDetailsOfDriver(Driver driver) {
		ddao.save(driver);
		
	}

}
