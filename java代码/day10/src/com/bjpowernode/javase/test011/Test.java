package com.bjpowernode.javase.test011;

/**
 * ʵ�������/ʵ�����顾�˽����ݣ�ʹ�õķǳ��١�
 * 1. ʵ���������Ա�д�����Ҳ����ѭ���϶��µ�˳������ִ��
 * 2. ʵ��������ڹ��췽��ִ��֮ǰִ�У����췽��ִ��һ�Σ�ʵ��������Ӧִ��һ��
 * 3. ʵ�������Ҳ��java����Ϊ����Ա׼����һ�������ʱ�����������ʱ������Ϊ�������ʼ��ʱ��
 */
public class Test {
	
	// ���췽��
	public Test(){
		System.out.println("Test���ȱʡ������ִ��");
	}

	// ʵ�������
	{
		System.out.println(1);
	}
	
	// ʵ�������
	{
		System.out.println(2);
	}
	
	// ʵ�������
	{
		System.out.println(3);
	}
	
	// ������
	public static void main(String[] args) {
		System.out.println("main begin");
		new Test();
		new Test();
		
	}
	
	// ����ִ�н����
	/*
	main begin
	1
	2
	3
	Test���ȱʡ������ִ��
	1
	2
	3
	Test���ȱʡ������ִ��
	*/
}
