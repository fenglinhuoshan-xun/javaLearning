package com.bjpowernode.javase.test012;

public class Account {
	
	private String actno;
	private double balance;
	
	public Account() {
	}
	
	public Account(String actno, double balance) {
		this.actno = actno;
		this.balance = balance;
	}
	
	public String getActno() {
		return actno;
	}
	
	public void setActnc(String actno) {
		this.actno = actno;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
