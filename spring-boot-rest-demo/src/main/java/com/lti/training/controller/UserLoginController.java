package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lti.training.DTO.StatusDTO;
import com.lti.training.DTO.UserLoginDTO;

import com.lti.training.service.UserLoginService;


@RestController
public class UserLoginController {

	@Autowired
	private UserLoginService userloginService;

	@RequestMapping(path="/userLogin", method=RequestMethod.POST)
	public StatusDTO register(@RequestBody UserLoginDTO userloginDTO) {
		
		System.out.println(userloginDTO.getPassword());
		System.out.println(userloginDTO.getName());
		return userloginService.save(userloginDTO);
	   }
	
		}

