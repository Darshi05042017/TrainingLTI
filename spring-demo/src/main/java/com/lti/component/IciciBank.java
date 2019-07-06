package com.lti.component;

import org.springframework.stereotype.Component;

@Component("IcBank")
public class IciciBank implements Bank {

   public String amountWithdraw(int amount) {
	   
	  return "Amount withdraw from ICICI bank is :"+amount;
   }
}
