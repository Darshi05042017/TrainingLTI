package com.lti.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Register;
import com.lti.service.AdminLoginService;



@RestController
public class AdminLoginController {

	@Autowired
	private AdminLoginService adminloginService;
	
	@RequestMapping(path = "/adminLogin",method = RequestMethod.GET)
	public Register fetchPassword(@RequestParam ("email") String email) {
		System.out.println("controller reached");
		return adminloginService.showSearch(email);
	}
}
