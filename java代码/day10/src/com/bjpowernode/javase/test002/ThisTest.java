package com.bjpowernode.javase.test002;

public class ThisTest {
	// ʵ������������.�ķ�ʽ���ʣ�
	int num = 10;
	
	// ����static�ķ���
	// JVM�������main������JVM����ô���õģ�
	// ThisTest.main(string[]);
	public static void main(String[] args) {
		
		// û�е�ǰ�����this
		
		// ���´���ʲô��˼��
		// ���ʡ���ǰ���󡱵�num����
		// System.out.println(num); // ���뱨��
		
		// System.out.println(this.num); // ���뱨��
		
		// �����num����ô�죿
		ThisTest tt = new ThisTest();
		System.out.println(tt.num);
		
	}

}
