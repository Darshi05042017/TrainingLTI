package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import com.lti.model.User;

@Component("registerDaoImpl")
public class RegisterDaoImpl implements RegisterDao {
	
		@PersistenceContext
		private EntityManager entityManager;
		
		@Transactional
		public void addUser(User user) {
			entityManager.merge(user);
			
		}
		
		public User fetch(String email) {
			return entityManager.find(User.class, email);
			
			 
		}

	
}
