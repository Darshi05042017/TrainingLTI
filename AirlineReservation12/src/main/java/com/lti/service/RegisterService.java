package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.DTO.RegisterDTO;
import com.lti.DTO.StatusDTO;
import com.lti.Dao.RegisterDao;
import com.lti.entity.Register;


@Service
public class RegisterService {

@Autowired
private RegisterDao registerDao;
	
@Transactional
public StatusDTO save(RegisterDTO registerDto){
		
Register r1 = new Register();
		
	r1.setName(registerDto.getName());
	r1.setEmail(registerDto.getEmail());
	r1.setPhNo(registerDto.getPhNo());
	r1.setDob(registerDto.getDob());
	r1.setPass(registerDto.getPass());
	r1.setCnfpass(registerDto.getCnfpass());
	    
	registerDao.save(r1);
  StatusDTO status = new StatusDTO();
		
		status.setMessage("CONGRATULATIONS !! You Have Registered Successfully ");
		System.out.println("service called");
		return status;
	
	}
}
	