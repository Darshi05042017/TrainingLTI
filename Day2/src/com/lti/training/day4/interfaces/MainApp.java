package com.lti.training.day4.interfaces;

import org.omg.CORBA.VersionSpecHelper;

public class MainApp {
 
	 public static void main(String[] args) {
		Launcher launcher= new Launcher();
		
		MyMobileApplication1 app1 =new MyMobileApplication1();
		launcher.launch(app1);
		
		MyMobileApplication2 app2 =new MyMobileApplication2();
		launcher.launch(app2);
		
		//trying displaying count of running apps
		System.out.println();
		
		// to close all running apps 
		launcher.closeAllRunningApps();
		app1.version();
		
	}
}
