package com.jotiram.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jotiram.model.User;
@Repository
public interface UserDao extends CrudRepository<User, Long>{
	User findByUsername(String username);
}
