package com.stock.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stock.entity.User;

@Repository
public interface UserDao {

	List<User> findUserList();  
	
	
}
