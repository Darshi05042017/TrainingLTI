package com.lti.component;

import org.springframework.stereotype.Component;

@Component("bb")
public class CalcCalling implements Calculator {
	
	public double add(double a,double b) {
		
		return a+b;
	}

}
