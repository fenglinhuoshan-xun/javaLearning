package com.bjpowernode.javase.test005;

/**
 * 自定义的日期类型
 *
 *	this可以用在哪里？
 *		1. 可以使用在实例方法当中，代表当前对象【语法格式：this.】
 *		2. 可以使用在构造方法当中，通过当前的构造方法调用其他的构造方法【语法格式：this(实参);】
 *
 *	重点【记忆】：this()这种语法只能出现在构造方法第一行。即一个构造方法中只能写一次this()这种语法
 */
public class Date {
	// 属性
	private int year;
	private int month;
	private int day;
	
	// 有参数构造函数
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	/**
	 * 需求：当程序员调用以下无参数的构造方法的时候，默认创建的日期是“1970-1-1”
	 */
	
	// 无参数构造函数
	public Date() {
		// System.out.println(); // 写了这句，this()这句会报错
		/*
		year = 1970;
		month = 1;
		day = 1;
		*/

		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		// 以上代码可以通过调用另一个构造方法来完成
		// 但前提是不能创建新的对象，以下代码表示创建了一个全新的对象
		// new Date(1970,1,1);
		
		// 需要采用以下的语法来完成构造方法的调用
		// 这种方式不会创建新的java对象，但同时又可以达到调用其他的构造方法的目的】
		this(1970,1,1);
		
		// this()后面可以写语句
	}
	
	// setter and getter
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	// 对外提供一个方法，可以将日期打印输出到控制台
	// 实例方法
	public void print() {
		System.out.println(year + "年" + month + "月" + day + "日");
	}

}
