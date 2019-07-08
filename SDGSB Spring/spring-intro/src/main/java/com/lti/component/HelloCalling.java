package com.lti.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cw")
@Scope("prototype")
public class HelloCalling implements HelloWorld {

	public HelloCalling() {
		System.out.println("Contructor of hello calling");
	}
	public String sayHello(String name) {
	    //System.out.println(name);
		return "Hello "+name;
	}
	
	

}
