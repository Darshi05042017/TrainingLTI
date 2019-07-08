package com.lti.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallCalculator {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		//accessing one of the beans
		Calculator hww = (Calculator)context.getBean("bb"); //beanid
		
		System.out.println(hww.add(10,23));
	    

	}
}
