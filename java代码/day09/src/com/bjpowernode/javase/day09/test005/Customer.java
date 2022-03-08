package com.bjpowernode.javase.day09.test005;

public class Customer {
	
	private int no;
	private String name;
	private String bitrh;
	
	// 无参数的构造器
	public Customer() {
	}
	
	// 有参数的构造器
	public Customer(int a, String b, String c) {
		this.no = a;
		this.name = b;
		this.bitrh = c;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBitrh() {
		return bitrh;
	}
	public void setBitrh(String bitrh) {
		this.bitrh = bitrh;
	}	

}
