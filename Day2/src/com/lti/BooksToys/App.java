package com.lti.BooksToys;

public class App {
	public static void main(String[] args) {
		Book b1=new Book("Java", 99, 500.0, "A classic");
		Book b2=new Book("Java Unleashed", 99, 400.0, "A classic");
		b1=("Java", 99, 500.0, "A classic");
		Toy t1=new Toy("RC car", 99, 250, "RC car", "4-5");
		Toy t2=new Toy("Superhero", 99, 500, "Action", "5+");
		
		double bill1=b1.generateBill(40);
		System.out.println("Total bill for ordering 40 copies of "+ b1.getName()+" is "+bill1 );
	}

}
