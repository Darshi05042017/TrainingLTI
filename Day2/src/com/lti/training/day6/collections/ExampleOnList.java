package com.lti.training.day6.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.lti.training.day5.objectclass.Person;

public class ExampleOnList {
	public static void main(String[] args) {
		//angular brace notation is called as Generic in Java
		List<String> list1 = new LinkedList<String>();
		list1.add("Java");
		list1.add("Oracle");
		list1.add(".Net");
		list1.add("Python");
		list1.add("Java");
		
		List<String> list2 =new ArrayList<String>();
	//	list2.add("AI/ML");
	//	list2.add("Analytics");
		list2.add("Java");
		list2.add("Oracle");
		list2.add(".Net");
		list2.add("Python");
		list2.add("Java");
		
		
		//list1.addAll(list2);
		
		
		System.out.println("----------Traditional for loop--------");
		for(int i=0;i<list1.size();i++) {
			String str=list1.get(i);
			System.out.println(str);
		}
	//	list1.clear();
	//	list1.addAll(list2);
		if(list1.contains("Java")) {
			System.out.println("Yes java exists");
		}
		if(list1.containsAll(list2)) {
			System.out.println("Yes All exists");
		}
		else
			System.out.println("Not exists");
		System.out.println("------using foreach loop--------");
		for (String str:list1) {
			System.out.println(str);
		}
		if(list1.equals(list2))
			System.out.println("It's equal");
		else
			System.out.println("It's not equal");
		
	int a=	list1.indexOf("Oracle");
	System.out.println(a);
		
		System.out.println("------using lambda expression----");
		list1.forEach(str->System.out.println(str));
		
		System.out.println("------traditional iteration approach-----");
		Iterator<String> itr=list1.iterator();
		while (itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
						
		}
		
		List<String> list3 = list1.subList(1,3);
		System.out.println("-----result of sublist----");
		list3.forEach(str->System.out.println(str));
		
		////------------------------Storing object of some user defined class-------//
		List<Person> listOfPerson = new ArrayList<Person>();
		  listOfPerson.add(new Person("Harry",24));
		  listOfPerson.add(new Person("Hardy",23));
		  listOfPerson.add(new Person("Harsh",25));
		  listOfPerson.add(new Person("Harsha",26));
		  listOfPerson.forEach(Person->System.out.println(Person.getName()+"\t"+Person.getAge()));
		  
		  
	}

}
