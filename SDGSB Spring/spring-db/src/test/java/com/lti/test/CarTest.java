package com.lti.test;

import static org.junit.Assert.*;

import java.util.List;

import com.lti.component.CarPart;
import com.lti.component.CarPartsInventory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {

			ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
			
			CarPartsInventory cp = (CarPartsInventory) context.getBean("carPartsImpl4");
			CarPart cc=new CarPart();
						
			cc.setParNo(336);
			cc.setPartName("DiskBrake");
			cc.setCarModel("Bullet");
			cc.setQuantity(25);
			cp.addNewPart(cc);
			
			}
	
	@Test
	public void fetch() {

			ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
			
			CarPartsInventory cp = (CarPartsInventory) context.getBean("carPartsImpl4");
			CarPart cc=new CarPart();
						
			List<CarPart> list=cp.getAvailableParts();
			for(CarPart c : list){
				System.out.println(c.getParNo());
				System.out.println(c.getPartName());
				System.out.println(c.getCarModel());
				System.out.println(c.getQuantity()+"\n\n");

			}
			

	}
}


