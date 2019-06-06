package com.lti.training.day5.objectclass;

public class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person("Harry",24);
		// the below statement in C++ can be written like this:
		//cout << p1;  to print name and age in c++ we use operator overloading.
		System.out.println(p1); //what will be the output?
		
		Person p2 =new Person("Harry",24);
		System.out.println(p1==p2); //reference comparison
		System.out.println(p1.equals(p2)); //value comparison
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
