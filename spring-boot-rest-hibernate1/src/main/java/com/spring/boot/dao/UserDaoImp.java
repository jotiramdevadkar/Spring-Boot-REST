package com.spring.boot.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.bean.User;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		
	}

	@Override
	public List<User> getUser() {
		Session session=sessionFactory.getCurrentSession();
		
		List<User> list=session.createCriteria(User.class).list();
		
		return list;
	}

	@Override
	public User findById(int id) {
		
		Session session =sessionFactory.getCurrentSession();
		User user=session.get(User.class, id);
		return user;
	}

	@Override
	public User update(User user, int id) {
		Session session =sessionFactory.getCurrentSession();
		User user1=session.get(User.class, id);
		user1.setCountry(user.getCountry());
		user1.setName(user.getName());
		session.update(user1);
		return user1;
	}

	@Override
	public User updateCountry(User user, int id) {
		Session session=sessionFactory.getCurrentSession();
		User user1=session.load(User.class, id);
		user1.setCountry(user.getCountry());
		return user1;
	}

	@Override
	public void delete(int id) {
		Session session =sessionFactory.getCurrentSession();
		
		User user=findById(id);
		session.delete(user);
		
	}

}
