package com.lti.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {			//controller
	
	@RequestMapping("/hello.lti")
	public String handle(Map<String, Object> model) {
		model.put("message", "Welcome to spring mvc");		//model
		model.put("message", "I will override the previous message");
		return "hello.jsp";		//view
	}

}
