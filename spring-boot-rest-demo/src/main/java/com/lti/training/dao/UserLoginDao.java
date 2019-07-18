package com.lti.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.UserLogin;


//@Component
@Repository
public class UserLoginDao {

	@PersistenceContext
	private EntityManager entitymanager;
	
	public UserLogin save(UserLogin userlogin) {
		Query query =entitymanager.createQuery("select ul from UserLogin ul where ul.name=:un and ul.password=:up");
		query.setParameter("un",userlogin.getName());
		query.setParameter("up", userlogin.getPassword());
		 UserLogin userId =(UserLogin) query.getSingleResult();
		return userId;
		
		
		
	}
	
	/*public User search(String email) {
		Query q=entitymanager.createQuery("select u from User u where u.email =:em");
		q.setParameter("em",email);
	   User us=(User)q.getSingleResult();
		return us;
	}*/
}
