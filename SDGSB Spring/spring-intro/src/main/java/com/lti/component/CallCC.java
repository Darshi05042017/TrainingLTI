package com.lti.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallCC {
	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		//accessing one of the beans
		CurrencyConverter cc = (CurrencyConverter)context.getBean("cc"); //beanid
		//System.out.println(cc.convertDollarsToRupees(10));
	}

}
