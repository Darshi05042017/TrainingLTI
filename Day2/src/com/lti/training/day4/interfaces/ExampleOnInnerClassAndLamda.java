package com.lti.training.day4.interfaces;

interface Printer {
	void print(String document);
}

class DotMatrixPrinter implements Printer {

	@Override
	public void print(String document) {
	    System.out.println(" Currently Printing " + document);
	   
	}
}


public class ExampleOnInnerClassAndLamda {
	//inner class can be private
	private class Abc{
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	
	}
	
	public static void main(String[] args) {
		//this is inner class
		/* class A{
		 }
		 */
		//inner class
		class DeskJetPrinter implements Printer {

			@Override
			public void print(String document) {
			    System.out.println(" Now Printing " + document);
			   
			}
		}
		Printer p=new DeskJetPrinter();
		p.print("abc.txt");
		Printer dp=new DotMatrixPrinter();
		dp.print("xyz.txt");
		
		//anonymous inner class
		Printer sp=new Printer() {
			
			@Override
			public void print(String document) {
				// TODO Auto-generated method stub
				System.out.println("Hii printing " + document);
			}
		};
		sp.print("acd.txt");
		
		//anonymous functions--a.k.a lambda expressions
		// lamda expressions are nothing but anonymous inner classes in other  
		Printer pr1 = (document)->{
			System.out.println("Now printing"+document);
		};
		pr1.print("hello.txt");
	}
}
