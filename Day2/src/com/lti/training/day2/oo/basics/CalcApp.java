package com.lti.training.day2.oo.basics;

public class CalcApp {
	public static void main(String[] args) {
		String s="calculator";
		int num=65;
		Calculator cal=new Calculator();
		cal.add(10, 10);
		cal.sub(40,5);
		Calculator.mul(6, 7);
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.toUpperCase());
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.highestOneBit(num));
		//static method that can be called directly without objects
		
		
	}

}
