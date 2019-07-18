package com.lti.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.DTO.AdminLoginDTO;
import com.lti.training.DTO.StatusDTO;
import com.lti.training.DTO.passDetsDTO;
import com.lti.training.dao.adminLoginDao;
import com.lti.training.dao.passDetailsDao;
import com.lti.training.entity.AdminLogin;
import com.lti.training.entity.PassAddDets;


//@Component
@Service
public class passDetsService {
	
	@Autowired
	private passDetailsDao passdetailsDao;
	
	@Transactional
	public StatusDTO save(passDetsDTO[] passdetsDTO) {
		//Copying the data from the DTO to entity 
		StatusDTO status = new StatusDTO();

			for(passDetsDTO p:passdetsDTO) {
				
				PassAddDets pass=new PassAddDets();
				pass.setGender(p.getGender());
				pass.setName(p.getName());
				pass.setPhNo(p.getPhNo());
				passdetailsDao.save(pass);
			}
			
			status.setId(0);
			status.setMessage("THE DETAILS HAVE BEEN ADDED SUCCESSFULLY ");
			
		
		return status;
	}
	

	}
	

