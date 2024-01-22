package com.newSoft.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newSoft.crud.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
