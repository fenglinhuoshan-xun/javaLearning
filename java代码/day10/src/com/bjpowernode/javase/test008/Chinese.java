package com.bjpowernode.javase.test008;

/**
 * ���й��ˡ���
 *
 */
public class Chinese {
	
	// ���֤�š�ÿһ����������֤�Ų�ͬ��
	// ʵ������
	String id;
	
	// ������ÿһ�������������ͬ��
	// ʵ������
	String name;
	
	// ������ÿһ���������ڶ����ɡ�Chinese�ࡱʵ�����ģ�����ÿһ���й��˵Ĺ������ǡ��й�����
	// ����ͨ��Chinese��ʵ�������ٸ�java������Щjava����Ĺ������ǡ��й���
	// ʵ��������ʵ��������һ��java���󣬾���һ�ݣ�100��java���󣬾���100��country��������������Ʒ�ʽ��ʲôȱ�㣿
	// ʵ�������洢��java�����ڲ������ڴ浱�У��ڹ��췽��ִ�е�ʱ����ɳ�ʼ��
	// ���е��й��˵Ĺ������ǡ��й�������������Ϊʵ��������Ȼ�ǲ����ʵģ�̫�˷��ڴ�ռ䣬û��Ҫ��ÿһ�����󶼱���һ�ݡ��������ڴ�
	String country;
	
	// ���캯��
	public Chinese() {
		/*
		this.id = null;
		this.name = null;
		this.country = null;
		*/
	}
	
	public Chinese(String id,String name,String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

}
