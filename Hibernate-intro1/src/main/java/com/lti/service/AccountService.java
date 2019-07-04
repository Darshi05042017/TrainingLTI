package com.lti.service;

import java.util.Date;
import java.util.List;

import com.lti.dao.AccountDao;
import com.lti.entity.Account;
import com.lti.entity.Activity;


//Classes which contain business logic are commonly referred to as service classes
//people also use this naming convention in WebServices(SOAP/REST)
public class AccountService {
	AccountDao dao=new AccountDao();
	public void openAccount(Account acc) {
		dao.save(acc);
		//Apart from this we might write/execute the code for sending email to the customer here
	}
	public void withdraw(long acno, double amount) {
	Account ac=(Account) dao.fetchByPk(Account.class, acno);
	Double amt = ac.getBalance();
	Activity act=new Activity();
	if(amt<amount) {
		System.out.println("InSufficient Balance");
		
	}
	else
	{
		act.setDat(new Date());
		act.setTyp("withdraw");
		act.setAmount(amount);
		ac.setBalance(amt-amount);
		dao.save(ac);
		act.setAccount(ac);
		dao.save(act);
	}
	
		
	}
	public void deposit(long acno, double amount) {
		Account ac=(Account) dao.fetchByPk(Account.class, acno);
		Double amt = ac.getBalance();
		Activity act=new Activity();
		
			act.setDat(new Date());
			act.setTyp("Deposit");
			act.setAmount(amount);
			ac.setBalance(amt+amount);
			dao.save(ac);
			act.setAccount(ac);
			dao.save(act);
		
	}
	public void transfer(long fromAcno, long toAcno, double amount) {
		Account ac1=(Account) dao.fetchByPk(Account.class, fromAcno);
		Account ac2=(Account) dao.fetchByPk(Account.class, toAcno);
		
		Double amt1 = ac1.getBalance();
		Double amt2 = ac2.getBalance();
		if(amt1<amount) {
			System.out.println("InSufficient Balance");
		}
		else {
	
			Activity act1=new Activity();
			act1.setDat(new Date());
			act1.setTyp("transfer to account "+toAcno);
			act1.setAmount(amount);
			ac1.setBalance(amt1-amount);
			dao.save(ac1);
			act1.setAccount(ac1);
			dao.save(act1);
			
			Activity act2=new Activity();
			act2.setDat(new Date());
			act2.setTyp("Received from account "+fromAcno);
			act2.setAmount(amount);
			ac2.setBalance(amt2+amount);
			dao.save(ac2);
			act2.setAccount(ac2);
			dao.save(act2);
		}
	}
	public double checkBalance(long acno) {
		Account ac=(Account) dao.fetchByPk(Account.class, acno);
		Double amt1 = ac.getBalance();
		return amt1;
	}

	public List<Activity> miniStatement(long acno){
		List<Activity> list = dao.fetchMiniStatement(acno);
		return list;
	}
	public List<Account> thousandOrMore( double balance){
		List<Account> list = dao.fetchAcc1000(balance);
		return list;
	}
	public List<Account> withdrawnHundred( String type,double amount){
		List<Account> list = dao.fetchAccByActivity(type, amount);
		return list;
	}
}
