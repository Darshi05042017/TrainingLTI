package com.lti.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login.lti")
	public String execute(
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			Map<String,Object> model) {
		
		if(username.equals("Harry") && password.equals("1234567890")) {
			model.put("loggedInUser",username);
			return "welcome.jsp";
		}
		
		else {
			model.put("message","Invalid Username/Password");
			return "Login.jsp";
		}
			
	                                                                                                                                                 																																																									                                      																																																																																																																														                                                                  
	}

}
