package com.bjpowernode.javase.test006;

public class Test {
	
	// ����static�ķ���
	public static void method1() {
		
		// ����doSome
		// ʹ��������ʽ����
		Test.doSome();
		// ʹ��ʡ�Է�ʽ����
		doSome();
		
		// ����doOther
		// ʹ��������ʽ����
		Test tt = new Test();
		tt.doOther();
		// ʹ��ʡ�Է�ʽ����
		
		// ����i
		// ʹ��������ʽ����
		System.out.println(tt.i);
		// ʹ��ʡ�Է�ʽ����
	}
	
	// û��static�ķ���
	public void method2() {
		// ����doSome
		// ʹ��������ʽ����
		Test.doSome();
		// ʹ��ʡ�Է�ʽ����
		doSome();
		
		
		// ����doOther
		// ʹ��������ʽ����
		this.doOther();
		// ʹ��ʡ�Է�ʽ����
		doOther();
		
		// ����i
		// ʹ��������ʽ����
		System.out.println(this.i);
		// ʹ��ʡ�Է�ʽ����
		System.out.println(i);
		
	}
	
	// ������
	public static void main(String[] args) {
		// Ҫ���������д���򣬵���method1()
		// ʹ��������ʽ����
		Test.method1();
		// ʹ��ʡ�Է�ʽ����
		method1();
		
		// Ҫ���������д���򣬵���method2()
		Test t = new Test();
		// ʹ��������ʽ����
		t.method2();
		// ʹ��ʡ�Է�ʽ����
		
		
	}
	
	// û��static�ı���
	int i = 10;
	
	// ����static�ķ���
	public static void doSome() {
		System.out.println("do some!");
	}
	
	// û��static�ķ���
	public void doOther() {
		System.out.println("do Other");
	}

}
