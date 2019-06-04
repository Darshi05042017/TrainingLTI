package com.lti.training.day3.assignment;

public class Books extends Product{

		double discount;
		int qty;
		double bill;
	public Books(String book, int stock) {
		prName =book;
		stock=this.stock;
		
		if (book=="Comics") {
			prId=10;
		price=270;
		prDesc="This is a Comics";
		}
		else 
		{
			prId=2;
			price=850;
			prDesc ="This is a Book";
		}
	discount= (10*price/100) ;
			
		
				
	}

	
	
}
