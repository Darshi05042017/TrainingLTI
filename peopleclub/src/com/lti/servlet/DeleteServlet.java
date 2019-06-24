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

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
	  List<People> people=new ArrayList<People>();
	  People p=new People();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  int id=Integer.parseInt(request.getParameter("idno"));
	  Service1 sc=new Service1();
	  p=sc.delete(id);
	  response.sendRedirect("delete.jsp");
	  
	  
		
		
	}

}
