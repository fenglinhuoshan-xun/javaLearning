package com.bjpowernode.javase.day09.test006;

/**
 * �������ս��ۣ��������õ�ʱ���漰���������ݵ�ʱ��javaֻ��ѭһ���﷨���ƣ����ǽ������б���ġ�ֵ�������ݹ�ȥ��ֻ�������ֵ��ʱ����һ������ֵ����ʱ����һ��java������ڴ��ַ
 */
public class Test02 {

	public static void main(String[] args) {
		User u = new User(20);
		
		// ����u��add������ʱ��ʵ���ϴ��ݵ���u�����б����ֵ��ֻ�������ֵ��һ��java������ڴ��ַ
		add(u); // ctrl + 1���س������Զ����ɷ���
		System.out.println("main --> " + u.age); // 21
	}
	

	private static void add(User u) {
		// TODO Auto-generated method stub
		u.age++;
		System.out.println("add --> " + u.age); // 21
		
	}
}

class User{
	
	// ʵ������
	int age;
	
	// ���췽��
	public User(int i) {
		age = i;
	}
}
