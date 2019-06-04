package com.lti.training.day3.inheritance.v3;

public class LogFactory {

	public static Logger getLoggerInstance() {
		return new ConsoleLogger();
		//return new FileLogger();
	}
}
