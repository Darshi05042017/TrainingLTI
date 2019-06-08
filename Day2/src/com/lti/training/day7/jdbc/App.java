package com.lti.training.day7.jdbc;

import java.util.List;

public class App {
	public static void main(String[] args) {
		ProductDao dao=new ProductDao();
		/*Product p=new Product();
		p.setId(3);
		p.setName("Nokia 7700");
		p.setPrice(5600);
		p.setQuantity(89);
		
		dao.add(p);*/
		
		
		List <Product>products = dao.fetchAll();
		for (Product p1 : products){
		System.out.println("ID ==" + p1.getId());
		System.out.println("Name is : "+p1.getName());
		System.out.println("Price is : "+ p1.getPrice());
		System.out.println("Quantity is : "+ p1.getQuantity());
	}

}
}

