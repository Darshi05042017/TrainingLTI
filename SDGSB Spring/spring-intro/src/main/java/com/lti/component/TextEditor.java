package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
 
//DI 
@Component("text")
public class TextEditor {
	
	@Autowired
	private SpellChecker sc;
     
	public void load(String doc) {
		System.out.println(doc  +  "loaded  ");
		//SpellChecker sc = new SpellChecker();
		sc.spellCheck(doc);
      
	}
}
