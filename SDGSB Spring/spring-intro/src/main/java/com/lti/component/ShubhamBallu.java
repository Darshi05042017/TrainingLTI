package com.lti.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShubhamBallu {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
		BalluKiShadi bs=(BalluKiShadi)context.getBean("ballu");
		bs.kabHai();
	}

}
