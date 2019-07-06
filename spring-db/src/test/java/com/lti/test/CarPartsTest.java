package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.CarPart;
import com.lti.component.CarPartsInventory;

public class CarPartsTest {

	@Test
	public void add() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CarPartsInventory cp= (CarPartsInventory)context.getBean("carPartsImpl1");
		
		CarPart carp=new CarPart();
		carp.setPartno(1);
		carp.setPartname("wheel");
		carp.setCarModel("Jaguar");
		carp.setQuantity(20);
		cp.addNewPart(carp);
		
		
	}

}
