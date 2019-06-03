package com.lti.training.day3.inheritance.v1;

import java.time.LocalDateTime;

/**
 * A simple custom logger Implimentation
 * @author Harinder Kumar
 * @version 1.0
 *
 */
public class Logger {
	
	public void log(String msg) {
		
		log(msg,LogLevel.INFO);
	}
public void log(String msg, LogLevel level) {
	switch(level) {
	case INFO :
		System.out.println("[INFO] ["+LocalDateTime.now() + " ]"+msg);
		break;
	case WARN : 
		System.out.println("[WARNING] ["+LocalDateTime.now() + " ]"+msg);
		break;
	case ERROR : 
		System.out.println("[ERROR] ["+LocalDateTime.now() + " ]"+msg);
		break;
		
	}
}
}
