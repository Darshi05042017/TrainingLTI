package com.lti.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.AdminLogin;



@Repository
public class adminLoginDao {


	@PersistenceContext
	private EntityManager entityManager;
	
	public AdminLogin fetchEmail(String email){
		AdminLogin customer=(AdminLogin) entityManager.createQuery("select c from Customer c where c.email = :email").setParameter("email",email).getSingleResult();
		return customer;


	}

}