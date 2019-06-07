package com.lti.training.day6;

public class EmployeeApp1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Passport p = new Passport();
		AadharCard aa = new  AadharCard(1123, "Jerry", "Mumbai");
		emp.setAadharCard(aa);
		
		emp.setEmpno(1234);
		emp.setName("Harry");
		emp.setDateOfJoining("10-12-2018");
		emp.setSalary(3545.79);	
		p.setPassportNo("121445");
		emp.setPassport(p);
		
		emp.displayDetails();
	}
}
