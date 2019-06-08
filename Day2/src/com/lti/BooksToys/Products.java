package com.lti.BooksToys;

public abstract class Products {
	
	private static int sequence = 1000;
	
	private int id=sequence++;
	private String name;
	private int stockInHand;
	private double price;
	private String desc;
	
	public Product(String name, int stockInHand, double price, String desc) {
		super();
		this.name = name;
		this.stockInHand = stockInHand;
		this.price = price;
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getStockInHand() {
		return stockInHand;
	}
	public double getPrice() {
		return price;
	}
	public abstract double calcDiscount();
	
	public double generateBill(int quantity) {
		double total=(price-calcDiscount())*quantity;
		return total;
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
}
