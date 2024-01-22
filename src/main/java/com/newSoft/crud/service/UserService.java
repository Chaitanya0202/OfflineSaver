package com.newSoft.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newSoft.crud.dao.UserDao;
import com.newSoft.crud.dto.User;

@Service
public class UserService {
	
	
	@Autowired
	private UserDao dao;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return dao.saveUser(user);
	}

	public User deletrUserById(int id) {
		// TODO Auto-generated method stub
		return dao.deletrUserById(id);
	}

}
