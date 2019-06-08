package com.lti.training.day6.collections;

import java.util.HashMap;
import java.util.Map;

public class ExampleOnMap {

	public static  void main(String[] args) {
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("192.168.1.1","Harry");
		map1.put("192.168.1.5","Uma");
		map1.put("192.168.1.2","Puma");
		map1.put("192.168.1.3","uma");
		
		String user = map1.get("192.168.1.5");
		System.out.println(user);
		
		
		
	}
}
