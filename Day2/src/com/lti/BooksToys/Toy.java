package com.lti.BooksToys;

public class Toy extends Product {
	
	public Toy(String name, int stockInHand, double price, String desc,String ageGrp) {
		super(name, stockInHand, price, desc);
		this.ageGrp=ageGrp;
	}
	private String ageGrp;

	public double calcDiscount() {
		if(ageGrp.equals("2-4")) {
			return 0.15*getPrice();
		}
		else if(ageGrp.equals("4-5")) {
			return 0.05*getPrice();
		}
		else
			return 0;
	}
	

}
