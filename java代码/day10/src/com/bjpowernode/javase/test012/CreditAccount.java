package com.bjpowernode.javase.test012;

public class CreditAccount extends Account{
	
	private String actno;
	private double balance;
	private double credit;
	
	public CreditAccount() {
	}

	public double getCredit() {
		return credit;
	}
	
	public void setCredit(double credit) {
		this.credit = credit;
	}
	
}
