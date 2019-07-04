package com.lti.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaymentDaoTest {

	@Test
	public void testAdd() {
	    GenericDao dao = new GenericDao();
	    Order or=(Order) dao.fetchByPk(Order.class, 82);
	    
	    Payment pay=new Payment();
	 
	    pay.setAmount(2000);
	    pay.setMod("Paytm");
	    pay.setStatus("Paid");
	    pay.setOrder(or);
	    dao.save(pay);
	}

}
