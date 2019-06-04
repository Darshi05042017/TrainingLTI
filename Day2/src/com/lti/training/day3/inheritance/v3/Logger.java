package com.lti.training.day3.inheritance.v3;

/**
 * A simple custom logger Implimentation
 * @author Harinder Kumar
 * @version 1.0
 *
 */
public abstract class Logger {
    public void log(String msg) {
		
		log(msg,LogLevel.INFO);
	   }
	public abstract void log(String msg, LogLevel level) ;
		
			
	
	
}
