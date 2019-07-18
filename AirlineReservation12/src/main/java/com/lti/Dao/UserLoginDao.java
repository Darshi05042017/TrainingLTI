package com.lti.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Register;



@Repository
public class UserLoginDao {

	@PersistenceContext
	EntityManager entitymanager;
	
	public Register fetchOne(String email) {
		Register register =  entitymanager.find(Register.class, email);
		System.out.println("Password is "+register.getPass());
		
		return register;
		
	}
	
}
