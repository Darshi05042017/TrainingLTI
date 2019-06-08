package com.lti.training.day6.collections;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.lti.training.day5.objectclass.Person;

public class ExampleOnSorting {
	public static void main(String[] args) {
		//for sorting we can use a dedicated sorting method
		//alternatively TreeSet is a type of collection where
		//data is by default sorted
		//for Sortinfg data we need to implement comparable /Comparator 
		
		//if we need to store int, float,double and any other primitive 
		//value in a collection we need to use the wrapper classes
		//primitives are directly not supported
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(50);
		list1.add(30);
		list1.add(20);
		list1.add(40);
		
		System.out.println("----Before Sorting-----------");
		for(Integer no : list1)
			System.out.println(no);
		
		TreeSet<Integer> tr = new TreeSet<Integer>(list1);
		System.out.println("----After Sorting(Using TreeSet)---------");
		for(Integer no : tr)
			System.out.println(no);
		
		Collections.sort(list1);
		System.out.println("----After Sorting(Using Sort method)---------");
		for(Integer no : list1)
			System.out.println(no);
		
		
		// how to sort data in case of user defined objects in collection
		List<Person> listOfPerson = new ArrayList<Person>();
		  listOfPerson.add(new Person("Harry",24));
		  listOfPerson.add(new Person("Sumit",23));
		  listOfPerson.add(new Person("Amit",25));
		  listOfPerson.add(new Person("Ramit",26));
		  listOfPerson.add(new Person("Crag",29));
		  listOfPerson.add(new Person("Harsha",46));
		  
		  //we need to write our own comparator 
		  Comparator<Person> c = new  Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				//return -p1.getName().compareTo(p2.getName());// - will help to sort in descending order else in ascending order
				return p1.getAge() - p2.getAge();// its sorting on basis of age
				
			}
		}; 
		
		// age desc
		Comparator<Person> c3 = (p1,p2)-> p2.getAge() - p1.getAge();
		//name asc
		Comparator<Person> c4 = (p1,p2)-> p1.getName().compareTo(p2.getName());
		
		
		  Collections.sort(listOfPerson,c4);
		  for(Person p : listOfPerson)
			  System.out.println(p);
			  
	}

}
