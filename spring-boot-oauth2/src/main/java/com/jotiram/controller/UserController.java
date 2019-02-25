package com.jotiram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jotiram.model.User;
import com.jotiram.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> listUser()
	{
		return userService.findAll();
	}
	
	
	@PostMapping("/user")
	public User create(@RequestBody User user) {
			
		return userService.save(user);
	}
	
	@GetMapping("/user/{id}")
	public User findOne(@PathVariable long id)
	{
		return userService.findOne(id);
	}
	
	@PutMapping("/user/{id}")
	public User update(@PathVariable long id,@RequestBody User user)
	{
		user.setId(id);
		return userService.save(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable long id)
	{
		userService.delete(id);
	}
}
