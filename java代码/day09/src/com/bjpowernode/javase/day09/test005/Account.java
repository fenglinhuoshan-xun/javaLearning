package com.bjpowernode.javase.day09.test005;

// 账户类
public class Account {

	// 账号
	private String actno; // 实例变量/对象变量,也就是说，必须先有对象，才能有对应的实例变量
	// 余额
	private double balance;
	
	// 无参数的构造器
	public Account() {
		// 初始化实例变量的内存空间
		// actno = null;
		// balance = 0.0;
	}
	
	public Account(String s) {
		actno = s;
	}
	
	public Account(double b) {
		balance = b;
	}
	
	public Account(String s, double b) {
		actno = s;
		balance = b;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
