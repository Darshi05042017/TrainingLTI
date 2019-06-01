package com.lti.training.day2.oo.basics;
// JavaBean / POJO (plain old java objects).

public class Passport {
    private String passportNo;
	private String issueDate;
	private String expiryDate;
	private String nameOfThePerson;
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getNameOfThePerson() {
		return nameOfThePerson;
	}
	public void setNameOfThePerson(String nameOfThePerson) {
		this.nameOfThePerson = nameOfThePerson;
	}
	
}
