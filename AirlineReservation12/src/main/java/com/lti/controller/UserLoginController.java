package com.lti.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Register;
import com.lti.service.UserLoginService;


@RestController
public class UserLoginController {

	@Autowired
	private UserLoginService userloginService;
	
	@RequestMapping("/userLogin")
	public Register fetchPassword(@RequestParam (name="email") String email) {
		System.out.println("controller reached");
		return userloginService.showSearch(email);
	}
}
