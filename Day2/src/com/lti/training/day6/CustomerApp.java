package com.lti.training.day6;
//
public class CustomerApp {
	public static void main(String[] args) {
		Customer c = new Customer();
		Address a = new Address();
		
		c.setName("Harry");
		c.setEmail("abc1233@gmail.com");
		a.setCity("Greater Noida");
		a.setPincode(201310);
		a.setState("U.P.");
		c.setAddress(a);
		
		c.display();
		
	}
		
	


	
}
