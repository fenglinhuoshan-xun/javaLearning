package com.bjpowernode.javase.test005;

/**
 * �Զ������������
 *
 *	this�����������
 *		1. ����ʹ����ʵ���������У�����ǰ�����﷨��ʽ��this.��
 *		2. ����ʹ���ڹ��췽�����У�ͨ����ǰ�Ĺ��췽�����������Ĺ��췽�����﷨��ʽ��this(ʵ��);��
 *
 *	�ص㡾���䡿��this()�����﷨ֻ�ܳ����ڹ��췽����һ�С���һ�����췽����ֻ��дһ��this()�����﷨
 */
public class Date {
	// ����
	private int year;
	private int month;
	private int day;
	
	// �в������캯��
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	/**
	 * ���󣺵�����Ա���������޲����Ĺ��췽����ʱ��Ĭ�ϴ����������ǡ�1970-1-1��
	 */
	
	// �޲������캯��
	public Date() {
		// System.out.println(); // д����䣬this()���ᱨ��
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
		// ���ϴ������ͨ��������һ�����췽�������
		// ��ǰ���ǲ��ܴ����µĶ������´����ʾ������һ��ȫ�µĶ���
		// new Date(1970,1,1);
		
		// ��Ҫ�������µ��﷨����ɹ��췽���ĵ���
		// ���ַ�ʽ���ᴴ���µ�java���󣬵�ͬʱ�ֿ��Դﵽ���������Ĺ��췽����Ŀ�ġ�
		this(1970,1,1);
		
		// this()�������д���
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
	
	// �����ṩһ�����������Խ����ڴ�ӡ���������̨
	// ʵ������
	public void print() {
		System.out.println(year + "��" + month + "��" + day + "��");
	}

}
