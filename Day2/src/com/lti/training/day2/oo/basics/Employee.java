package com.lti.training.day2.oo.basics;

public class Employee {
	 private int  empno;
		private String name;
		private String dateOfJoining;
		private double salary;
		// has- a-relationship
        // association
		//one-to-one association
		private Passport passport;
		private AadharCard aadharCard;
		
		
				
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
		public String getDateOfJoining() {
			return dateOfJoining;
		}
		public void setDateOfJoining(String dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Passport getPassport() {
			return passport;
		}
		public void setPassport(Passport passport) {
			this.passport = passport;
		}
		public AadharCard getAadharCard() {
			return aadharCard;
		}
		public void setAadharCard(AadharCard aadharCard) {
			this.aadharCard = aadharCard;
		}
		
		public void displayDetails()
		{
			System.out.println();
			System.out.println("Aadhar  no is : " + aadharCard.getAadharNo());
			System.out.println("address is : "+ aadharCard.getAddress());
			System.out.println("Emp No is : "+ empno);
			System.out.println("Name of the emp : " + name);
			System.out.println("DOJ is  : " + dateOfJoining);
			System.out.println("Salary is : "+ salary);
			System.out.println("passport is : " + passport.getPassportNo());	
		}		
		
}
