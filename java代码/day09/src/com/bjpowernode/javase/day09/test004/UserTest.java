package com.bjpowernode.javase.day09.test004;

public class UserTest {

	public static void main(String[] args) {

		// ����User����
		User user = new User();

		// ���뱨��age����˽�л������ⲿ�����в���ֱ�ӷ���
		// �Ӵ�֮��age���Էǳ��İ�ȫ�������ŵ�̫��ȫ��
		// ����Ŀǰ�ĳ�����˵��age���Գ������ⲿ���ʲ�����
		// System.out.println(user.age);

		// �޸�
		user.setAge(-100);

		// ��ȡ
		System.out.println(user.getAge());
	}

}
