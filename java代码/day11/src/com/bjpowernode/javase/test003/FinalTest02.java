package com.bjpowernode.javase.test003;

public class FinalTest02 {
	
	// ��Ա����֮ʵ������
	// ʵ��������Ĭ��ֵ + final���εı���һ����ֵ�������¸�ֵ
	// �ۺϿ��ǣ�java�������չ涨��ʵ������ʹ��final֮�󣬱����ֶ���ֵ�����ܲ���ϵͳĬ��ֵ
	// final int age; // �������
	
	// ��һ�ֽ���������Լ��ֶ���ֵ
	final int age = 10;
	
	// �ڶ��ֽ��������
	final int num;
	
	public FinalTest02(){
		this.num = 200;
	}
	
	// ���ϵ����ֽ����������ʵ�����Ͼ���һ�ַ�ʽ�������ڹ��췽��ִ�еĹ��̵��и�ʵ��������ֵ
	
	
	public static void main(String[] args) {
		
		final int a;
		a = 100;
		// ���ɶ��θ�ֵ
		// a = 200;
	}

}
