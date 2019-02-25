package com.jotiram.service;

import java.util.List;

import com.jotiram.model.User;

public interface UserService {

	User save(User user);
	List<User> findAll();
	User findOne(long id);
	void delete(long id);
}
