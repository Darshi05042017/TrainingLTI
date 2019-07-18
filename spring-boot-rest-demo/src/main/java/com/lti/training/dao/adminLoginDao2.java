package com.lti.training.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import com.lti.training.entity.User;
@Repository
public class adminLoginDao2 {

	@PersistenceContext
	EntityManager entitymanager;
	
	public User fetchOne(String email) {
		User user =  entitymanager.find(User.class, email);
		System.out.println("Password is "+user.getPass());
		
		return user;
		
	}
	
}