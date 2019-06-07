package com.lti.training.day6;



public class App1 {

	public static void main(String[] args) {
		// creating obj of Student class.
		Student  student1 = new Student();
		student1.name="aaa";
		student1.college="kct";
		student1.doj="11 jan 2019";
		System.out.println("\n Student name is :" + student1.name + "\n College Name is : " + student1.college + " \n Doj is :" + student1.doj);
		System.out.println();
		Passport pass=new Passport();
		pass.setPassportNo("123");
		pass.setIssueDate("11-08-2019");
		pass.setExpiryDate("11-08-2022");
		pass.setNameOfThePerson("Tom");
			
		System.out.println("Passport no is : " + pass.getPassportNo());
		System.out.println("issue date is : " + pass.getIssueDate());
		System.out.println("expirydate is : "+ pass.getExpiryDate());
		System.out.println("name of the person is : " + pass.getNameOfThePerson());
		AadharCard ac = new AadharCard(75621234567L,"Hardy","delhi");
	System.out.println();
		System.out.println("Aadhar  no is : " + ac.getAadharNo());
		System.out.println("name is : " + ac.getName());
		System.out.println("address is : "+ ac.getAddress());
		
		
		
		}
}