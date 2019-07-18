package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.lti.training.DTO.StatusDTO;
import com.lti.training.DTO.UserLoginDTO;
import com.lti.training.dao.UserLoginDao;
import com.lti.training.entity.UserLogin;


//@Component
@Service
public class UserLoginService {
	
	@Autowired
	private UserLoginDao userloginDao;
	
	@Transactional
	public StatusDTO save(UserLoginDTO userloginDTO) {
		
		UserLogin userlogin = new UserLogin();
		
		userlogin.setName(userloginDTO.getName());
		userlogin.setPassword(userloginDTO.getPassword());
		UserLogin userlogin1 = new UserLogin();
	    userlogin1 =userloginDao.save(userlogin);
		
		StatusDTO status = new StatusDTO();
		status.setId(userlogin1.getId());
		
		status.setMessage("CONGRATULATIONS !! You Have Logged in Successfully ");
		return status;
	
	}
	

	}
	

