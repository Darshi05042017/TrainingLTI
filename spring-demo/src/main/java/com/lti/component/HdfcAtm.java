package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hdfcatm")
public class HdfcAtm implements Atm{
	
	@Autowired
	@Qualifier("IcBank")//we need to use thos in case bank interface has more than 1 implementation
	private Bank bk;
	
	public String withdraw(int amount) {
		
		return bk.amountWithdraw(amount);
	
	}

}
