package com.lti.training.DTO;


public class passDetsDTO {
	
    private int id;
    private String gender;
	
	private String name;
	private int phNo;
	
	@Override
	public String toString() {
		return "passDetsDTO [id=" + id + ", gender=" + gender + ", name=" + name + ", phNo=" + phNo + "]";
	}
	public passDetsDTO() {
		
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}