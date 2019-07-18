package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.DTO.RegisterDTO;
import com.lti.DTO.StatusDTO;
import com.lti.service.RegisterService;


@RestController
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(path="/register", method=RequestMethod.POST)
		public StatusDTO register(@RequestBody RegisterDTO registerDTO) {
		System.out.println("controller");
		return registerService.save(registerDTO);
	   }
	
	}



