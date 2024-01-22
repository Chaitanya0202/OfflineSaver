package com.newSoft.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newSoft.crud.dto.User;
import com.newSoft.crud.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/saveUser")
	private User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@DeleteMapping("/deletrUserById/{id}")
	private User deletrUserById(@PathVariable int id) {
		return service.deletrUserById(id);
	}
}
