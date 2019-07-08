package com.lti.component;

import org.springframework.stereotype.Component;

@Component("cc") //alternative to <bean ..id class............> cc is the bean id here bitches
public class CurrencyConverter {
	
	public void convertDollarsToRupees(double dollars) {
		
		System.out.println("The converted amount is "+dollars*64.88);
	}

}
