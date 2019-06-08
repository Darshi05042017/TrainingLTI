package com.lti.training.day6.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserManager2 {
	private Map<String,String> users;

	//private List<User> users;
	
	public UserManager2() {
		users = new HashMap<String,String>();
		users.put("Hardy","123");
		users.put("Harsh","456");
		users.put("Harry","789");
		
	}
	
	public boolean isValid(String username , String password) {
	//	String uname= users.forEach(User->System.out.println(User.getUsername()));
		
			if(users.containsKey(username) ) {
				String pwd =users.get(username);
				if(pwd.equals(password))
					return true;
			}
			
			return false;
			
		
		
	/*	for(User user : users)
			if (user.getUsername().equals(username))
				if(user.getPassword().equals(password))
					if(user.isActive())
						return true;
		return false;
		*/
	}
	
	public static void main(String[] args) {
		UserManager2 mgr = new UserManager2();
		boolean isValid= mgr.isValid("Harry","789");
				System.out.println(isValid);
	}
	
}
