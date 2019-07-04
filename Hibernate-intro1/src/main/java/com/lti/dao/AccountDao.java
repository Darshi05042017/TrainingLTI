package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Account;
import com.lti.entity.Activity;
import com.lti.entity.GenericDao;

public class AccountDao extends GenericDao {
	
	public List<Activity> fetchMiniStatement(long acno){
		EntityManagerFactory emf =null;
		 EntityManager em=null;
		try{
		emf=  Persistence.createEntityManagerFactory("oracleTest");
	
		 em=  emf.createEntityManager();
		 String ql = "select t from Activity t where t.account.acno = :ac order by t.dat desc";
		  Query q = em.createQuery(ql);
		  q.setParameter("ac",acno);
		  q.setMaxResults(5);
		   List<Activity> list=q.getResultList();
		   return list;	
		}
		finally {
		      em.close();
			 emf.close();
		}
			 
	}
	public List<Account> fetchAcc1000(double balance){
		EntityManagerFactory emf =null;
		 EntityManager em=null;
		try{
		emf=  Persistence.createEntityManagerFactory("oracleTest");
	
		 em=  emf.createEntityManager();
		 String ql = "select t from Account t where t.balance >= :bal";
		  Query q = em.createQuery(ql);
		  q.setParameter("bal",balance);
		   List<Account> list=q.getResultList();
		   return list;	
		}
		finally {
		      em.close();
			 emf.close();
		}
			 
	}
	public List<Account> fetchAccByActivity(String type,double amount){
		EntityManagerFactory emf =null;
		 EntityManager em=null;
		try{
		emf=  Persistence.createEntityManagerFactory("oracleTest");
	
		 em=  emf.createEntityManager();
		 String ql = "select a  from Account a JOIN a.activity at"
		 		+ " where at.typ= :tp and at.amount>= :amt ";
		  Query q = em.createQuery(ql);
		  q.setParameter("tp",type);
		  q.setParameter("amt",amount);
		   List<Account> list=q.getResultList();
		   return list;	
		}
		finally {
		      em.close();
			 emf.close();
		}
			 
	}
}
