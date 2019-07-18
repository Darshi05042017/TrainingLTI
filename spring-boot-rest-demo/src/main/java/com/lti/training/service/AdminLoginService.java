package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.DTO.AdminLoginDTO;
import com.lti.training.DTO.StatusDTO;
import com.lti.training.dao.adminLoginDao;
import com.lti.training.entity.AdminLogin;


@Service
public class AdminLoginService {

	@Autowired
	private adminLoginDao loginDao;
	
	public AdminLoginDTO showSearch(AdminLoginDTO loginDetail){
		AdminLoginDTO cust = null;
		AdminLogin customer = loginDao.fetchEmail(loginDetail.getEmail());
		if(customer.getPassword().equals(loginDetail.getPassword())) {
			 cust=new AdminLoginDTO(customer);
		}
		else {
			cust=new AdminLoginDTO();
			cust.setCustomerId(-1);			
		}
		return cust;


	}
	
		
	
}

