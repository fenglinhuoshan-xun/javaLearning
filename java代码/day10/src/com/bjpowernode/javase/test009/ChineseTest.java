package com.bjpowernode.javase.test009;

public class ChineseTest {

	public static void main(String[] args) {
		
		// �����й��˶���1
		Chinese zhangsan = new Chinese("1","����");
		System.out.println(zhangsan.id + "," + zhangsan.name + "," + Chinese.country);
		
		// �����й��˶���2 
		Chinese lisi = new Chinese("2","����");
		System.out.println(lisi.id + "," + lisi.name + "," + Chinese.country);
		
		// �����й��˶���3
		Chinese wangwu = new Chinese("3","����");
		System.out.println(wangwu.id + "," + wangwu.name + "," + Chinese.country);
		
		System.out.println(Chinese.country);
		System.out.println(zhangsan.country);
		zhangsan = null;
		// ���о�̬�����ݣ����ǿ��Բ��á�����.����Ҳ���Բ��á�����.�������ǽ�����á�����.���ķ�ʽ����
		// ���á�����.���ķ�ʽ���ʵ�ʱ�򣬼�ʹ������null��Ҳ������ֿ�ָ���쳣����Ϊ���ʾ�̬�����ݲ���Ҫ����Ĵ���
		System.out.println(zhangsan.country);
	}
}
