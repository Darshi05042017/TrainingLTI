package com.lti.training.exceptionHandling;

public class BankAccount2 {
      
	 private int acno;
	 private String name;
	 private double balance;
	 
	 public BankAccount2(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	 
	  public double withdraw(double amount) throws Error{
		  if(amount>balance) {
			  Error e= new Error("Insufficient Balance");
			  throw e;
		  }
		  else {
			  balance =balance- amount;
			  return balance;
		  }
	  }
	  
	  public static void main(String[] args) {
		
		  BankAccount2 bankApp=new BankAccount2(1234, "godi manda", 5000);
		  try {
			  double balance=bankApp.withdraw(6000);
			  System.out.println("Balance left: "+balance);
		  }
		  
		  catch(Error e) {
			  System.out.println(e.getMessage());
		  }
		  
	}
	 
	 
	 
}
