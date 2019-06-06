package com.lti.training.exceptionHandling;



public class UserDefinedException {
      
	 private int acno;
	 private String name;
	 private double balance;
	 
	 public UserDefinedException(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	 
	  public double withdraw(double amount) throws AccountException{
		  if(amount>balance) {
			  AccountException e= new AccountException("Insufficient Balance");
			  throw e;
		  }
		  else {
			  balance =balance- amount;
			  return balance;
		  }
	  }
	  
	  public static void main(String[] args) {
		
		 UserDefinedException bankApp=new UserDefinedException(1234, "godi manda", 5000);
		
		  try {
			  double balance=bankApp.withdraw(6000);
			  System.out.println("Balance left: "+balance);
		  }
		  
		catch(AccountException e) {
			 System.out.println(e.getMessage());
		 }
		finally {
			  System.out.println(" Some messge here !!!");
		  }
    }
	 
}
