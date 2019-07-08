package com.lti.traininghib;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("foodProductImpl")
public class FoodProductImpl implements Food {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewFood(FoodProducts foodproduct) {
		entityManager.merge(foodproduct);
		
	}

	public List<FoodProducts> getFoodDetails() {
		return entityManager.createQuery("select c from FoodProducts c").getResultList();
		
	}

}
