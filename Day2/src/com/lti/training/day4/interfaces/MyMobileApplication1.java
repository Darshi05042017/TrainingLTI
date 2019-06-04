package com.lti.training.day4.interfaces;

/**
 * My Mobile application 
 * @author HK
 *
 */

public class MyMobileApplication1 implements MobileApplication  {

	@Override
	public void start() {
		System.out.println("My awesome Mobile Application1 started !!!");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("My awesome Mobile Application1 paused !!!");
		
	}

	@Override
	public void stop() {
		System.out.println("My awesome Mobile Application1 stopped !!!");
	
	}
	
}
