package com.lti.training.day4.interfaces;

/**
 * Contract for a Mobile Application
 * @author Google Inc.
 *
 */
public interface MobileApplication {

	String INFO =" Developed by Google Inc.";
	
	public void start();
	public void pause();
	public void stop();
	
	public default void version() {
	System.out.println(INFO + " Version 1.0");
	}
}
