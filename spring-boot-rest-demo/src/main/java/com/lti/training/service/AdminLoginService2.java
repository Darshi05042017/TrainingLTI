package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.adminLoginDao2;

import com.lti.training.entity.User;

@Service
public class AdminLoginService2 {

	@Autowired
	private adminLoginDao2 adminloginDao;
	
	public User showSearch(String email) {
		System.out.println("service is called");
		
		User user= new User();
		return adminloginDao.fetchOne(email);
	}
	
}
