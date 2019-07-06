package com.lti.component;

import org.springframework.stereotype.Component;

@Component("calc")
public class CalculatorImpl implements Calculator {

	public int CalcAdd(int a,int b) {
		
		int sum=a+b;
		return sum;
		
	}
	
public int CalcMinus(int a,int b) {
		
		int diff=a-b;
		return diff;
		
	}
}
