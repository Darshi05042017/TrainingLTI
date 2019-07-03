package com.lti.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GenericDao {//BaseDao,CommonDao,SabkaDao,...
	
	public void save(Object obj) {
		EntityManager em =null;
		EntityManagerFactory emf=null;
		
		try {
			emf=Persistence.createEntityManagerFactory("oracle-pu");
			em= emf.createEntityManager();
			EntityTransaction ts=em.getTransaction();
			ts.begin();
			//Find Method generates select Query
			em.merge(obj);//merge method can be used for insert as well as update
			ts.commit();
		}
		
		finally {
			em.close();
			emf.close();
		}

	}
	public Object fetchById(Class classname, Object cstId) {
		EntityManager em =null;
		EntityManagerFactory emf=null;
		
		 try {
				 emf=Persistence.createEntityManagerFactory("oracle-pu");
		        em= emf.createEntityManager();
			
				//Find Method generates select Query
				Object obj= em.find(classname, cstId);
				return obj;
		 }
		 
		 
			finally {	
				em.close();
				emf.close();
			}
		
	}
	
	
	
	
	public <E>List<E> fetchAll(Class<E> clazz) {
		EntityManager em =null;
		EntityManagerFactory emf=null;
		try {
	emf=Persistence.createEntityManagerFactory("oracle-pu");
	em= emf.createEntityManager();

	//Introducing JP_QL/HQL
	
	Query q=em.createQuery("select obj from "+ clazz.getName() +" as obj ");
	List<E> list=q.getResultList();
	return list;
		}
	
	finally {
	em.close();
	emf.close();
	}
	

}
	
	
	
	
	public void addPayment(Payment payment) {
			EntityManager em =null;
			EntityManagerFactory emf=null;
			
			try { //1-create EntityManagaerFactory object
			emf=Persistence.createEntityManagerFactory("oracle-pu");
			//2- Create/load EntityManager object
			 em= emf.createEntityManager();
			
			//3-Start Transactions
			
			EntityTransaction tx =em.getTransaction();
			tx.begin();
			
			em.persist(payment);//persist method generates insert query and finds table from object class
			tx.commit();
			}
					
			finally {
			//Below code shld be in finally block
			em.close();
			emf.close();
			}
}
	
}
