package com.bjpowernode.javase.test005;

public class DateTest {
	
	public static void main(String[] args) {
		
		// 创建日期对象1
		Date time1 = new Date();
		time1.print();
		
		// 创建日期对象2
		Date time2 = new Date(2000,1,26);
		time2.print();
	}
}
