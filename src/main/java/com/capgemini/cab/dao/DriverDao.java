package com.capgemini.cab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.cab.driver.Driver;

@Repository
public interface DriverDao extends JpaRepository<Driver,Long>{

}
