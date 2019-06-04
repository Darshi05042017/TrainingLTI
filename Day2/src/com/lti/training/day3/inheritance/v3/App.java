package com.lti.training.day3.inheritance.v3;

public class App {
	public static void main(String[] args) {
		//testing our logger
		//Logger l=new Logger();
		//ConsoleLogger l =new ConsoleLogger();
		Logger l=LogFactory.getLoggerInstance();
		l.log("App started successfully ....");
		l.log("Some Message",LogLevel .INFO);
		l.log("Again some Message",LogLevel.WARN);
		l.log("Some critical message",LogLevel.ERROR);
		
	}

}
