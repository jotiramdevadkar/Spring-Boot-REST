package com.jotiram.foodstall.service;

import com.jotiram.foodstall.model.User;

public interface UserService {

	
	User findByUsername(String username);
}
