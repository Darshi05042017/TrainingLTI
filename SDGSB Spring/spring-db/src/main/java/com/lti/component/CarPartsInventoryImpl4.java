package com.lti.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

//using Hibernate
@Component("carPartsImpl4")
public class CarPartsInventoryImpl4 implements CarPartsInventory {
	//this time we are injecting EntityManager object required when using JPA
	//@Autowired doesn't work for injecting the same,
	// we are using the @PersistenceContext Annotation instead
	@PersistenceContext
	private EntityManager entityManager; 
	
	@Transactional
	public void addNewPart(CarPart carPart) {
		   entityManager.persist(carPart);
			
	}
	
	public List<CarPart> getAvailableParts() {
		//String sql = "select c from CarPart c";
		//javax.persistence.Query q=entityManager.createQuery(sql);
		//List<CarPart> list =q.getResultList();
		//return list;
		return entityManager.createQuery("select c from CarPart c").getResultList();
		 
	}

}
