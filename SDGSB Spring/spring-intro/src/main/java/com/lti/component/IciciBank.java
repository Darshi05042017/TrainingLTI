package com.lti.component;

import org.springframework.stereotype.Component;

@Component("icici")
public class IciciBank implements Bank {

	public String Approve() {
		return "\nWe Approved Ur Request";
	}
}
