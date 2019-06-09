package com.lti.training.day7.jdbc.assignment;

import java.util.List;
import java.util.Scanner;

import com.lti.training.day7.jdbc.Product;

public class PeopleClub {

	public static void main(String[] args) {
		PeopleDao dao=new PeopleDao();
		People p=new People();
		int i;
	Boolean ch;
	Scanner sc =new Scanner(System.in);
		ch=sc.nextBoolean();
		do {
			System.out.println("People Club details");
			System.out.println("\n press 1 for Insert Details \n press 2 for get Member details \n press 3 for get details on basis of city \n Press 4 Update member City \n press 5  to delete member on basis of id ");
			i=sc.nextInt();
			switch(i) {
			case 1:
				p.setId(sc.nextInt());
				p.setFname(sc.nextLine());
				p.setLname(sc.nextLine());
				p.setDob(sc.nextLine());
				p.setCity(sc.nextLine());
				
				dao.add(p);
				break;
			case 2 : 
				List <People>peoples = dao.fetchAll();
				for (People p1 : peoples){
				System.out.println("ID ==" + p1.getId());
				System.out.println("First Name is : "+p1.getFname());
				System.out.println("First Name is : "+p1.getLname());
				System.out.println("Dob : "+ p1.getDob());
				System.out.println("City is : " + p1.getCity());
				}
				break;
				case 3 :
					List <People>peoples1 = dao.fetchNumber();
					for (People p1 : peoples1){
					System.out.println("ID ==" + p1.getId());
					System.out.println("First Name is : "+p1.getFname());
					System.out.println("First Name is : "+p1.getLname());
					System.out.println("Dob : "+ p1.getDob());
					System.out.println("City is : " + p1.getCity());
					}
					break;
				case 4:
					p.setId(sc.nextInt());
					p.setCity(sc.nextLine());
					
					break;
					
				case 5 : 
					break;
					default :
						System.out.println("You Enter Wrong Choice");
				
			
			}
		}
		while (ch == true);
		
		
		
		
		
	
}
}
