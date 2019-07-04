package com.lti.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transaction;


@Entity
@Table(name = "Account")
public class Account {

	@Id
	   @GeneratedValue(strategy = GenerationType.SEQUENCE)
	   @Column(name="Acc_No", updatable = false, nullable = false)
	  private long acno;
	  private String name;
	  private String typ;
	  private double balance;
	  
	  @OneToMany(mappedBy="account")
	  private Set<Activity> activity;


	public long getAcno() {
		return acno;
	}


	public void setAcno(long acno) {
		this.acno = acno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getTyp() {
		return typ;
	}


	public void setTyp(String typ) {
		this.typ = typ;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Set<Activity> getActivity() {
		return activity;
	}


	@Override
	public String toString() {
		return "Account [acno=" + acno + ", name=" + name + ", typ=" + typ + ", balance=" + balance + "]";
	}


	public void setActivity(Set<Activity> activity) {
		this.activity = activity;
	}
}
