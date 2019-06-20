package com.lti.exam.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.exam.model.Option;
import com.lti.exam.model.Question;
import com.lti.exam.model.QuestionBankLoader;


@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	
	private int currentQuestion;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		QuestionBankLoader qbl=new QuestionBankLoader();
		List<Question> question=qbl.fetchQuestionsOnJava();
		if(currentQuestion<question.size()){
	
		Question q=question.get(currentQuestion++);
		request.getSession().setAttribute("currentQs",q);
		response.sendRedirect("showQuestion.jsp");
		}
		
		else {
			response.sendRedirect("showResult.jsp");
		}
		
	}

	
}
