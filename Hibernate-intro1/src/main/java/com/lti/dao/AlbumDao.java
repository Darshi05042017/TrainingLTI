package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Activity;
import com.lti.entity.GenericDao;
import com.lti.entity.Song;

public class AlbumDao extends GenericDao{

	public List<Song> fetchSongFromAlbum(int albumid) {
		EntityManagerFactory emf =null;
		 EntityManager em=null;
		try{
		emf=  Persistence.createEntityManagerFactory("oracleTest");
	
		 em=  emf.createEntityManager();
		 String ql = "select t from Song t where t.album.id =:ac";
		
		  Query q = em.createQuery(ql);
		  q.setParameter("ac",albumid);
		  
		  List<Song> list=q.getResultList();
		   return list;	
		}
		finally {
		      em.close();
			 emf.close();
		}
			 
	
	}
 }


