package com.lti.dao;

import com.lti.model.User;

public interface RegisterDao {
	public void addUser(User user);
	public User fetch(String email);

}
