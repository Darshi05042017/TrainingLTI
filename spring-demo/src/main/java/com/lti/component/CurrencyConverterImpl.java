package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cc") //alternate to <bean id="...." class="....">
public class CurrencyConverterImpl implements CurrencyConverter {

	@Autowired
	private CurrencyValue cval;
	
	public double convertDollarsToRupees(double dollars) {
		double val= cval.currval();
		return dollars* val;
		
	}
}
