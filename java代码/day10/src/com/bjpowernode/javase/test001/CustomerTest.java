package com.bjpowernode.javase.test001;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		// ����Customer����
		Customer c1 = new Customer();
		c1.name = "zhangsan";
		
		// c1����
		c1.shopping();
		
		// �ٴ���Customer����
		Customer c2 = new Customer();
		c2.name = "lisi";
		
		// c2����
		c2.shopping();
		
		// ����doSome���������η��б�����static��
		// ��������.�ķ�ʽ���ʣ��������������ִ�е�ʱ�򣬲���Ҫ����Ĳμ�
		Customer.doSome();
		
		// ����doOther
		Customer.doOther();
	}

}
