package com.bjpowernode.javase.day09.test005;

// �˻���
public class Account {

	// �˺�
	private String actno; // ʵ������/�������,Ҳ����˵���������ж��󣬲����ж�Ӧ��ʵ������
	// ���
	private double balance;
	
	// �޲����Ĺ�����
	public Account() {
		// ��ʼ��ʵ���������ڴ�ռ�
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
