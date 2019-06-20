package com.lti.exam.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {
	
	public List<Question> fetchQuestionsOnJava(){
		QuestionBank qb=new QuestionBank();
		qb.addNewSubject("Java");
		
		Question q=new Question();
		q.setQuestion("What is a class ?");
		
		List<Option> opts=new ArrayList<Option>();
		Option o1=new Option();
		o1.setOption("class is a template of an object");
		o1.setRightAnswer(true);
		
		Option o2=new Option();
		o2.setOption("class is instance of object");
		o2.setRightAnswer(false);
		
		Option o3=new Option();
		o3.setOption("class is another name of object");
		o3.setRightAnswer(false);
		
		Option o4=new Option();
		o4.setOption("all the above");
		o4.setRightAnswer(false);
		
		opts.add(o1);
		opts.add(o2);
		opts.add(o3);
		opts.add(o4);
		
		q.setOptions(opts);
		qb.addNewQuestion("Java",q);
		
		
		//QUESTION2
		 q=new Question();
		q.setQuestion("What is an object ?");
		
		opts=new ArrayList<Option>();
		o1=new Option();
		o1.setOption("object is a semi template of an class");
		o1.setRightAnswer(false);
		
		o2=new Option();
		o2.setOption("object is instance of class");
		o2.setRightAnswer(true);
		
		 o3=new Option();
		o3.setOption("object is another name of class");
		o3.setRightAnswer(false);
		
		 o4=new Option();
		o4.setOption("all the above");
		o4.setRightAnswer(false);
		
		opts.add(o1);
		opts.add(o2);
		opts.add(o3);
		opts.add(o4);
		
		q.setOptions(opts);
		qb.addNewQuestion("Java",q);
		
		
		
		//QUESTION3
		
		 q=new Question();
			q.setQuestion("What is ABSTRACTION ?");
			
			opts=new ArrayList<Option>();
			o1=new Option();
			o1.setOption("Abstraction is a software represtion of real world objects");
			o1.setRightAnswer(true);
			
			o2=new Option();
			o2.setOption("abstraction is instance of method");
			o2.setRightAnswer(false);
			
			 o3=new Option();
			o3.setOption("abstraction is also known as polymorphism");
			o3.setRightAnswer(false);
			
			 o4=new Option();
			o4.setOption("all the above");
			o4.setRightAnswer(false);
			
			opts.add(o1);
			opts.add(o2);
			opts.add(o3);
			opts.add(o4);
			
			q.setOptions(opts);
			qb.addNewQuestion("Java",q);
			
			
			
			//QUESTION4
			
			 q=new Question();
				q.setQuestion("What is an INTERFACE ?");
				
				opts=new ArrayList<Option>();
				o1=new Option();
				o1.setOption("It is a method only");
				o1.setRightAnswer(false);
				
				o2=new Option();
				o2.setOption("Interface is used to inherit classes");
				o2.setRightAnswer(false);
				
				 o3=new Option();
				o3.setOption("Interface provides a blueprint of the method");
				o3.setRightAnswer(true);
				
				 o4=new Option();
				o4.setOption("all the above");
				o4.setRightAnswer(false);
				
				opts.add(o1);
				opts.add(o2);
				opts.add(o3);
				opts.add(o4);
				
				q.setOptions(opts);
				qb.addNewQuestion("Java",q);
				
				
				return qb.getQuestionsFor("Java");
		
		
		
		
	}

}
