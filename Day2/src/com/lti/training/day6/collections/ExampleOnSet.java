package com.lti.training.day6.collections;

import java.util.HashSet;
import java.util.Set;

import com.lti.training.day5.objectclass.Person;

public class ExampleOnSet {
	public static void main(String[] args) {
		
		// hashset depends upon the hashcode and equals method
		// 
		
		Set<String> set1=new HashSet<String>();
		set1.add("Java");
		set1.add("Oracle");
		set1.add("PHP");
		set1.add(".NET");
		set1.add("java");
		
		for (String str : set1) {
			System.out.println(str);
		}
			
			Set<Person> setOfPerson = new HashSet<Person>();
			 setOfPerson.add(new Person("Harry",24));
			 setOfPerson.add(new Person("Hardy",23));
			  setOfPerson.add(new Person("Harsh",25));
			  setOfPerson.add(new Person("Harry",24));
			  for(Person pr : setOfPerson)
				  System.out.println(pr);
		}
		
	
	
 
}
