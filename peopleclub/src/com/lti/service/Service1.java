package com.lti.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.Dao;


@WebServlet("/service1")
public class Service1 extends HttpServlet {
	   Dao da=new Dao();
	   List<People> people = new ArrayList<People>();
	
	
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
   }
public People displayAll() {
	
	people=da.displayAll();
	return (People) people;
	
}

public People display(int id) {
	people=da.delete(id);
	return (People) people;
	
	
}

public List<People> register(int id, String fname, String lname, String dob, String city) {
	int id1=id;
	String fname1=fname;
	String lname1=lname;
	String dob1=dob;
	String city1=city;
	
	people=da.register(id1,fname1,lname1,dob1,city1);
	return people;
	
}

public People delete(int id) {
	da.delete(id);
	return null;
	
}

}
