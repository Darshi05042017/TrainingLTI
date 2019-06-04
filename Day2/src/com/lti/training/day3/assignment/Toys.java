package com.lti.training.day3.assignment;

public class Toys extends Product {

	double discount;
	int qty;
	double bill;
	public Toys(String tyName, int stock,int age) {
		prName =tyName;
		stock=this.stock;
		
		if (tyName=="car") {
			prId=1;
		price=890.50;
		prDesc="This is a car";
		}
		else 
		{
			prId=2;
			price=850;
			prDesc ="This is a Toy";
		}
		
		if (age<=4){
			discount= (15*price/100) * qty;
					}
		else if (age > 4 && age <=5) {
		discount=(10*price/100) * qty;
		}
		else {
			discount=0;
		}
		bill=qty*(price-discount);
		
		}
	
void dispToy() {
	System.out.println();
}

}
