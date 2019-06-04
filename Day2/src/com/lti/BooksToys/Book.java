package com.lti.BooksToys;

public class Book extends Product {
	
	public Book(String name, int stockInHand, double price, String desc) {
		super(name, stockInHand, price, desc);
		// TODO Auto-generated constructor stub
	}

	public double calcDiscount() {
		return 0.1*getPrice();
	}
}
