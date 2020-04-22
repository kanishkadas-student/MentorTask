package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.Dao.UserDao;
import com.cognizant.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	
	public boolean check(User user) {
		// TODO Auto-generated method stub
		return userDao.check(user);
	}
	
}
