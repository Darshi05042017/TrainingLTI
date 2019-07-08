package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Currency;
import com.lti.component.HdfcAtm;
import com.lti.component.HelloWorld;
import com.lti.component.TextEditor;

public class HelloTest {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		//accessing one of the bean
		for(int i=0;i<5;i++) {
		TextEditor hmw = (TextEditor)context.getBean("text"); //beanid
		hmw.load("Godi ");
		}
		
		//Currency hac=(Currency) context.getBean("curr");
		//hac.create(2200);
		
		HdfcAtm atm=(HdfcAtm) context.getBean("bank");
		System.out.println(atm.Withdraw());
		
		

	}

}
