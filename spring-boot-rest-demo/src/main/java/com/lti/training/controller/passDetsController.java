package com.lti.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lti.training.DTO.AdminLoginDTO;
import com.lti.training.DTO.StatusDTO;
import com.lti.training.DTO.passDetsDTO;
import com.lti.training.service.AdminLoginService;
import com.lti.training.service.passDetsService;

@RestController
public class passDetsController {


	
	@Autowired
	private passDetsService passdetsService;

	@RequestMapping(path="/passdets", method=RequestMethod.POST)
		public StatusDTO register(@RequestBody passDetsDTO[] passdetsDTO) {
		for(passDetsDTO p:passdetsDTO) {
			System.out.println(p);
		}
		return passdetsService.save(passdetsDTO);
	   }
	
		}


