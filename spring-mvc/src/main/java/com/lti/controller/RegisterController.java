package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.dao.RegisterDao;
import com.lti.dao.RegisterDaoImpl;
import com.lti.model.User;
import com.lti.model.UserDTO;

import jdk.nashorn.internal.runtime.Context;

@Controller
public class RegisterController {
	/* 
	 * no need to read the form   data manually Spring can automatically populate a 
	 * bean object,i.e spring can automatically store form data in the object of a POJO class
	 * */
	@Autowired
	@Qualifier("registerDaoImpl")
	RegisterDao da;
	
	@RequestMapping("/register.lti")
	public String register(UserDTO userDTO) {
		// code for  processing the uploaded file
		String path = "d:/uploads/";
		String filename=userDTO.getName() +"-"+userDTO.getProfilePic().getOriginalFilename();
		String finalpath = path +filename;
		try {
			userDTO.getProfilePic().transferTo(new File(finalpath));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		//now the code to store data in the database
		User user =new User();
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setAge(userDTO.getAge());
		user.setProfilePicFileName(filename);
		da.addUser(user); 
		
	//da.addUser(userDTO);
	return "register.jsp";
	}
	
	@RequestMapping(path= "/searchUser.lti", method= RequestMethod.POST)
	public String search(@RequestParam("email") String email,
			 Map<String,Object> model) {
		User user= da.fetch(email);
		model.put("userData",user);
		
				return "searchResult.jsp";
		
	}
		

}
