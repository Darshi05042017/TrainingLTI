package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.UserLoginDao;
import com.lti.entity.Register;

@Service
public class UserLoginService {

	@Autowired
	private UserLoginDao userlogindao;
	
	public Register showSearch(String email) {
		System.out.println("service is called");
		
		Register register= new Register();
		return userlogindao.fetchOne(email);
	}
	
}
