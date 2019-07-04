package com.lti.entity;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CustomerDao {

	/* public void databaseAdd(Customer customer) {
		 //step 1 (load/create EntityManagerFactory object)
		 //during this step persistence.xml is read
		 EntityManagerFactory emf = null;
		 
		 //step 2 (load/create EntityManager object)
		 EntityManager em = null;
		 try {
			 emf= Persistence.createEntityManagerFactory("oracleTest");
			 em = emf.createEntityManager();
		     EntityTransaction tx = em.getTransaction();
		     tx.begin();
		     em.persist(customer);
		      tx.commit();
		       }
		 finally {
		 em.close();
		 emf.close();
		 }
		 //step 3 (start/participate in a transaction)
		// EntityTransaction tx = em.getTransaction();
		 //tx.begin();
		 
		 // now we can insert/update/delete/select whatever we want
		   // persist method generates insert query
		 
		 //tx.commit();
		
		 //below code should in finally block
		
	 }*/
	 public List<Customer> fetchAll(String email) {
		 EntityManagerFactory emf =null;
		 EntityManager em = null;
		 try {
			 emf= Persistence.createEntityManagerFactory("oracleTest");
			 em = emf.createEntityManager();
		     EntityTransaction tx = em.getTransaction();
		     tx.begin();
		     Query q = em.createQuery("select c from Customer as c where c.email like :em");
		     q.setParameter("em","%" + email + "%");
			 List<Customer> list=q.getResultList();
			 //Query q = em.createQuery("select c from Customer as c where c.email like '%@?%'");
			 //q.setParameter(1, email);
			
		      tx.commit();
		      return list;
		       }
		 //Query q=em.createQuery("select c from Customer c"); //select all
		 //Query q = em.createQuery("select c from Customer as c where c.city='mumbai'"); //select selected 
		
		 
		 finally {
			 em.close();
			 emf.close();
		 }
	
		 
		 //Customer c = em.find(Customer.class, custId);
		
		 
		
		 
		 	 }
	 public Customer update( Customer customer) {
		 EntityManagerFactory emf = null; 
		 EntityManager em = null;
		 try {
			 emf= Persistence.createEntityManagerFactory("oracleTest");
			 em = emf.createEntityManager();
		     EntityTransaction tx = em.getTransaction();
		     tx.begin();
		     em.merge(customer);
		      tx.commit();
		       }
		 finally {
		 em.close();
		 emf.close();
		 }
	 return customer;

	 }
}