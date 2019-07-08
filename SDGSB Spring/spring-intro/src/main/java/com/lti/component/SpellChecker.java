package com.lti.component;

import org.springframework.stereotype.Component;

@Component("spell")
public class SpellChecker {
    
	 public void spellCheck(String doc) {
		 System.out.println("spell check done " + doc);
	 }
}
                     