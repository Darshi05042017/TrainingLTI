package com.lti.training.day4.interfaces;

/**
 * Inbuilt Launcher
 * for launching Mobile Apps
 * @author Google Inc
 *
 */

public class Launcher {

	static TaskManager t1= new TaskManager();
	
	public void launch(MobileApplication mobileApp) {
		mobileApp.start();
		t1.inform(mobileApp);
	
		
		//mobileApp.pause();
		//mobileApp.stop();
	}
	
	
	public void closeAllRunningApps() {
		t1.clearAll();
	
	}
}
