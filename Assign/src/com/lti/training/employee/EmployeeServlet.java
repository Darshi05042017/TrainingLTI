package com.lti.training.employee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.training.employee.dao.EmployeeDao;
import com.lti.training.employee.exception.DataAccessException;
import com.lti.training.employee.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao employeeDao= new EmployeeDao();
		Employee employee= new Employee();
		int empno;
		empno=Integer.parseInt(request.getParameter("empno"));
		
		try {
			
			employee= employeeDao.fetchEmployee(empno);
			HttpSession session= request.getSession();
			
			session.setAttribute("Employee", employee);
			
			response.sendRedirect("viewEmployee.jsp");
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
