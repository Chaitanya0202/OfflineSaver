package com.newSoft.crud.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newSoft.crud.dto.User;
import com.newSoft.crud.repo.UserRepo;


@Repository
public class UserDao {
	
	@Autowired
	private  UserRepo repo;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public User deletrUserById(int id) {
		Optional<User>optional=repo.findById(id);
		if(optional.isPresent()) {
			User user=optional.get();
			repo.delete(user);
			return user;
		}
		return null;
	}

}
