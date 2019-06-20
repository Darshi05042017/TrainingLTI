package com.lti.exam.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {
	
	private Map<String, List<Question>> questionBank = new HashMap<String, List<Question>>();
	
	public void addNewSubject(String subjectName) {
		questionBank.put(subjectName,new ArrayList<Question>());
		
	}
	
	public void addNewQuestion(String subjectName,Question question) {
		List<Question> questions = questionBank.get(subjectName);
		questions.add(question);
	}
	
	public List<Question> getQuestionsFor(String subjectName){
		return questionBank.get(subjectName);
	}

	
	
	/*OR
	private List<Question> questionsOnPhp;
	private List<Question> questionsOnJava;
	private List<Question> questionsOnWeb;
	private List<Question> questionsOnDotnet;*/

}
