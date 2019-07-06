package com.lti.component;

import org.springframework.stereotype.Component;

@Component("splch")
public class SpellCheck {
	public void spellCheck(String doc) {

		System.out.println("Spell checker implemented: "+doc);
	}
}
