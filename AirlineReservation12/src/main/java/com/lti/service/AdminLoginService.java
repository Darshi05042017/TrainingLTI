package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.Dao.adminLogindao;
import com.lti.entity.Register;

@Service
public class AdminLoginService {

	@Autowired
	private adminLogindao adminlogindao;

	Register register= new Register();
	
	public Register showSearch(String email) {
		System.out.println("service is called");
		
		return adminlogindao.fetchOne(email);
	}
	
}
