package com.jotiram.foodstall.auth.service;

public interface SecurityService {

	String findLoggedInUsername();
	
	void autologin(String username , String password);
}
