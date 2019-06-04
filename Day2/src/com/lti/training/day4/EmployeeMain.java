package com.lti.training.day4;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		//Employee.compName="LTI";
		emp1.setEmpno(1001);
		emp1.setName("Harry");
		emp1.setSalary(10000);
		
		Employee emp2 = new Employee();
		emp2.setEmpno(1002);
		emp2.setName("Hardy");
		emp1.setSalary(20000);
		
		System.out.println(emp1.getEmpno());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		System.out.println(Employee.compName);
		
		System.out.println(emp2.getEmpno());
		System.out.println(emp2.getName());
		System. out.println(emp2.getSalary());
		System.out.println(emp2.compName);
		}
}
