package com.lti.training.day4.interfaces;

/**
 * an inbuilt task manager
 * @author Google inc
 *
 */
public class TaskManager {

	private MobileApplication[] runningApps;
	private static int count;
	
	public TaskManager() {
		runningApps = new MobileApplication[9999]	;		
	}
	
	public void inform(MobileApplication mobileApp) {
		 runningApps[count++]=mobileApp;
	 }
	 
	public int runningApps() {
		 return count;
	 }
	
	public void clearAll() {
		for(int i=0;i<count;i++)
			//for(MobileApplication app : runningApps)
			runningApps[i].stop();
		count=0;
	}
	
		
	
}
