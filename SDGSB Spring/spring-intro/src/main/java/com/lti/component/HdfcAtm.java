package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bank")
public class HdfcAtm implements Atm {

	@Autowired
	@Qualifier("icici")
	private Bank bank;
	public String Withdraw() {
	//	System.out.println(ic.Approve());
		return "We Recieved Ur Requestt " +bank.Approve();
	}
}
