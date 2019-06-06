package com.lti.training.day5.objectclass;

public class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person("Harry",24);
		// the below statement in C++ can be written like this:
		//cout << p1;  to print name and age in c++ we use operator overloading.
		System.out.println(p1); //what will be the output?
	}
}
