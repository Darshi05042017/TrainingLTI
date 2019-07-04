package com.lti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TBL_ORDER")
public class Order {
      
	   @Id
	   @GeneratedValue(strategy = GenerationType.SEQUENCE)
	   @Column(name="ORDER_ID", updatable = false, nullable = false)
	   private int id;
	   private Date orderDate;
	   private double amount;
	   
	   @ManyToOne
	   @JoinColumn(name = "cust_id")  //fk
	   private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	   
	   
	   
}
