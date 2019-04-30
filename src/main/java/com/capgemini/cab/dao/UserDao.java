package com.capgemini.cab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.cab.user.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{

}