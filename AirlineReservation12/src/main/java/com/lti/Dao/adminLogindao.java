package com.lti.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Register;



@Repository
public class adminLogindao {

	@PersistenceContext
	EntityManager entityManager;
	
public Register fetchOne(String email) {
		
		return (Register) entityManager.createQuery("select reg from Register reg where reg.email=:em").setParameter("em", email).getSingleResult();
		
		
	}
	
}
