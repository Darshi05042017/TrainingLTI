package com.lti.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.dao.ProductDao;
import com.lti.exception.DataAccessException;
import com.lti.model.Product;

/**
 * Servlet implementation class ProductControllerServlet
 */
@WebServlet("/ProductControllerServlet")
public class ProductControllerServlet extends HttpServlet {
	int pagesize=5;
	int currentPosition=1;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String page=request.getParameter("page");
		if(page!=null) {
			if(page.equals("next"))
				currentPosition+=pagesize;
			else if(page.equals("prev"))
				currentPosition-=pagesize;
		}
		else
			currentPosition=1;
		ProductDao dao=new ProductDao();
		try {
			List<Product> products=dao.fetchProducts(currentPosition, currentPosition+pagesize-1);
			HttpSession session = request.getSession();
			session.setAttribute("current5Products",products);
			response.sendRedirect("ViewProducts.jsp");
		} 
		catch (DataAccessException e) {
			e.printStackTrace();
			throw new ServletException("Problem encountered while accessing the DAO",e);
		}
	}

	
}
