package com.lti.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AR_PASS_DETAILS")
public class PassAddDets {
	@Id
	@GeneratedValue
	private int id;
	private String gender;
	
	private String name;
	private int phNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
