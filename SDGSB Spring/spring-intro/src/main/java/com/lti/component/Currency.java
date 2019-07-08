package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("curr")
public class Currency {

	@Autowired
	private CurrencyConverter cc;
	
	public void create(double value) {
		
		cc.convertDollarsToRupees(value);
	}
}
