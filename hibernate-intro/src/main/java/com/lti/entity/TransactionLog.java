package com.lti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TBL_TX_LOG")
public class TransactionLog {
	
	@Id
	@GeneratedValue
	@Column(name="TXNO")
	private long txno;
	
	@Column(name="TX_DATE")
	private Date date;
	
	@Column(name="TX_TYPE")
	private String type;
	private double amount;
	
	@ManyToOne
	@JoinColumn(name="ACNO")
	private Account account;
	
	
}
