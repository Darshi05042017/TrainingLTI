package com.lti.training.day6.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserManager {

	private List<User> users;
	
	public UserManager() {
		users = new ArrayList<User>();
		users.add(new User("Hardy","123",false));
		users.add(new User("Harsh","456",true));
		users.add(new User("Harry","789",true));
		
	}
	
	public boolean isValid(String username , String password) {
	//	String uname= users.forEach(User->System.out.println(User.getUsername()));
		
		for (User user : users)
		{
		if(username.equals(user.getUsername()) && password.equals(user.getPassword()) &&  user.isActive() ) {
			return true;
		}
	/*	else 
			return false;
		*/
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
		UserManager mgr = new UserManager();
		boolean isValid= mgr.isValid("Harry","789");
				System.out.println(isValid);
	}
	
}
