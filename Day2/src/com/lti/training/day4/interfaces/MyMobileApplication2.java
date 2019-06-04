package com.lti.training.day4.interfaces;

public class MyMobileApplication2 implements MobileApplication {


	@Override
	public void start() {
		System.out.println("My awesome Mobile Application2 started !!!");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("My awesome Mobile Application2 paused !!!");
		
	}

	@Override
	public void stop() {
		System.out.println("My awesome Mobile Application2 stopped !!!");
	
	}
	
}
