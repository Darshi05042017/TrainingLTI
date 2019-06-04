package com.lti.training.day4;

public class Employee {

	//instance variables
	private int empno;
	private String name;
	
	//class variables
	private static double salary ;
	public static  final String compName = "LTI";

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		Employee.salary = salary;
	}
	
}
