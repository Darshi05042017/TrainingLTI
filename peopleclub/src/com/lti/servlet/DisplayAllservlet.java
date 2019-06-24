package com.lti.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.service.People;
import com.lti.service.Service1;

/**
 * Servlet implementation class DisplayAllservlet
 */
@WebServlet("/displayAllservlet")
public class DisplayAllservlet extends HttpServlet {
	
  
	  List<People> people=new ArrayList<People>();
	  People p=new People();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Service1 sc=new Service1();
	p=sc.displayAll();
	people.add(p);
	HttpSession sc1=request.getSession();
	sc1.setAttribute("data", people);
	response.sendRedirect("display.jsp");
	
		
	}

}
