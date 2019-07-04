package com.lti.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GenericDao {

	
	public void save( Object obj) {
		 EntityManagerFactory emf = null; 
		 EntityManager em = null;
		 try {
			 emf= Persistence.createEntityManagerFactory("oracleTest");
			 em = emf.createEntityManager();
		     EntityTransaction tx = em.getTransaction();
		     tx.begin();
		     em.merge(obj); //merge can be used for insert as well as update
		      tx.commit();
		       }
		 finally {
		 em.close();
		 emf.close();
		 }

	 }
	
	 public  Object fetchByPk(Class classname,Object id) {
		 EntityManagerFactory emf =null;
		 EntityManager em = null;
		 try {
			 emf= Persistence.createEntityManagerFactory("oracleTest");
			 em = emf.createEntityManager();
		     Object obj= em.find(classname, id);
		     return obj;
		       }
	 
		 finally {
			 em.close();
			 emf.close();
		 }
	 }
	 
	 public <E> List<E> fetchAll(Class<E> clazz) {
		 EntityManagerFactory emf =  Persistence.createEntityManagerFactory("oracleTest");
		 EntityManager em =  emf.createEntityManager();
		     //EntityTransaction tx = em.getTransaction();
		     //tx.begin();
		     Query q = em.createQuery("select obj from " + clazz.getName() + " as obj ");
		     List<E> list=q.getResultList();
		     // tx.commit();
		      em.close();
			 emf.close();
			 return list;	
	 }
	 
	
}
