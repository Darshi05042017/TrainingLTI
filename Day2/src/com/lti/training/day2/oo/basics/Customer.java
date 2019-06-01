package com.lti.training.day2.oo.basics;

public class Customer {
	//
	private String name;
	private String email;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Name is : " + name);
		System.out.println("Email is : "+ email);
		System.out.println("city is : "+ address.getCity());
		System.out.println("state is : "+ address.getState());
		System.out.println("pincode is :"+address.getPincode());
	}
	
}
