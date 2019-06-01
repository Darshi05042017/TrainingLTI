package com.lti.training.day2.oo.basics;

public class AadharCard {
	private long aadharNo;
	private String name;
	private String address;
	public AadharCard(long aadharNo, String name, String address) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.address = address;
		
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//Blah Blah2
}
