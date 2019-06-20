package com.lti.exam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.exam.model.Option;
import com.lti.exam.model.Question;

/**
 * Servlet implementation class CalculateScoreServlet
 */
@WebServlet("/CalculateScoreServlet")
public class CalculateScoreServlet extends HttpServlet {
	
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 // picking up the current question from the session
		HttpSession session =request.getSession();
		Question q = (Question) request.getSession().getAttribute("currentQs");
		//reading value of the radio button
		int optionSelected = Integer.parseInt(request.getParameter("op"));
		
		
		//int score=0;
		Integer score=(Integer)session.getAttribute("score");
		if(score==null)
			score=0;
		// checking if the selected is the right answer
		
		Option op=q.getOptions().get(optionSelected);
		if(op.isRightAnswer())
			score++;
		//storing the score in the session of the user
		session.setAttribute("score",score);
		//session.setAttribute("questionno",questionNo);
		response.sendRedirect("QuestionLoaderServlet");
		//loading the next question
			
	}

}
