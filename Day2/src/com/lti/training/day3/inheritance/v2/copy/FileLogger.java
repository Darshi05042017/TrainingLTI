package com.lti.training.day3.inheritance.v2.copy;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger extends Logger  {
	public void log(String msg, LogLevel level) {
		try(FileWriter fw= new FileWriter("app.log",true)){ 
			//using true so that it does not delete the previous log and continue from last log
			switch(level) {
			case INFO :
				fw.write("[INFO] ["+LocalDateTime.now() + " ]"+msg +"\n");
				break;
			case WARN : 
				fw.write("[WARNING] ["+LocalDateTime.now() + " ]"+msg+"\n");
				break;
			case ERROR : 
				fw.write("[ERROR] ["+LocalDateTime.now() + " ]"+msg+"\n");
				break;
				
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
