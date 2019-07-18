package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.entity.AdminLogin;
import com.lti.training.entity.User;
import com.lti.training.service.AdminLoginService;
import com.lti.training.service.AdminLoginService2;


@RestController
public class adminLoginController2 {

	@Autowired
	private AdminLoginService2 adminloginService;
	
	@RequestMapping("/adminLogin2")
	public User fetchPassword(@RequestParam (name="email") String email) {
		System.out.println("controller reached");
		return adminloginService.showSearch(email);
	}
}