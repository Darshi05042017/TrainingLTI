package com.lti.component;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component("txtedit")
public class TextEditor {
	//DI
	@Autowired
	private SpellCheck sp;
	public void load(String doc) {
		//SpellCheck sc=new SpellCheck();
		sp.spellCheck(doc);
		System.out.println("Text editor implemented: "+doc);
		
	}

}
