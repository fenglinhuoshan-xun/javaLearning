package com.bjpowernode.javase.test003;

public class FinalTest03 {

	public static void main(String[] args) {
		
		// �����û�����
		User u = new User(100);
		
		// �ִ�����һ���µ�User����
		// ����ִ�е��˴���ʾ���϶����ѱ���������ݣ��ȴ������������Ļ���
		u= new User(200);
		
		// �����û�����
		final User user = new User(30);
		// user = new User(50); // final���ε����ã�һ��ָ��ĳ������֮�󣬲�����ָ������������ô��ָ��Ķ����޷�����������������
		System.out.println(user.id);
		
		user.id = 50; // final���ε����ã���Ȼָ��ĳ������֮�󣬲�����ָ���������󣬵�����ָ��Ķ����ڲ����ڴ��ǿ��Ա��޸ĵ�
		System.out.println(user.id);
	}
}
