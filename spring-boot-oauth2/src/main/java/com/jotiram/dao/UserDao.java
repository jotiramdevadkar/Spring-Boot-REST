package com.jotiram.dao;

import org.springframework.data.repository.CrudRepository;

import com.jotiram.model.User;

public interface UserDao extends CrudRepository<User, Long>{
	User findByUsername(String username);
}
