package com.bjpowernode.javase.day09.test004;

public class CustomerTest {

	public static void main(String[] args) {

		Customer c = new Customer();

		// ˽�е����ԣ��������ⲿֱ�ӷ���
		// c.id = 10;

		// ������ڱ����ֻ��ͨ��set��get�������з���
		// ��set������get����ִ�й����У����Խ��а�ȫ����
		c.setId(100);
		c.setName("����");
		c.setAge(20);
		c.setAddr("����������");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAddr());
	}

}
