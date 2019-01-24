package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.dao.UserDao;
import com.stock.entity.User;

@Service
public class UserService {

     @Autowired
     UserDao userDao;
		   
     public List<User> findUserList() {
		return userDao.findUserList();
     }
}
