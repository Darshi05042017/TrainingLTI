package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_USER_REG")
public class User {
	
   
	private String name;
	private int age;
	@Id
	private String email;
	private String city;
	private String ProfilePicFileName;
	
	public String getProfilePicFileName() {
		return ProfilePicFileName;
	}
	public void setProfilePicFileName(String profilePicFileName) {
		ProfilePicFileName = profilePicFileName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
}
