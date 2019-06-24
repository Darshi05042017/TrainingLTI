package com.lti.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.service.People;
import com.lti.service.Service1;



@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	
  List<People> people=new ArrayList<People>();
  People p=new People();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dob=request.getParameter("date");
		String city=request.getParameter("city");
			
	Service1 sc=new Service1();
	p= (People) sc.register(id,fname,lname,dob,city);
	
	response.sendRedirect("register.jsp");
	
	
				
	}

}
