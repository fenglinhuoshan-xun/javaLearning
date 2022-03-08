package com.bjpowernode.javase.day09.test005;

/**
 * ���췽�������ã�
 * 	1. ��������
 * 	2. ���������ͬʱ����ʼ��ʵ���������ڴ�ռ䡾����ʵ��������ֵ��
 * 
 * 
 * ��Ա����֮ʵ�����������ڶ��󼶱�ı��������ֱ����������ж��󣬲�����ʵ������
 * ʵ������û���ֶ���ֵ��ʱ��ϵͳĬ�ϸ�ֵ����ô���ϵͳĬ�ϸ�ֵ����ʲô�������ɵ��أ�����ʲôʱ����ɵ��أ���������ص�ʱ���𣿲��ǣ���Ϊ����ص�ʱ��ֻ�����˴���Ƭ�Σ���û���ü������������Դ�ʱʵ��������û�г�ʼ����ʵ����ʵ���������ڴ�ռ����ڹ��췽��ִ�й��̵�����ɿ��ٵģ���ɳ�ʼ����ϵͳ�ڸ�Ĭ��ֵ��ʱ��Ҳ���ڹ��췽��ִ�й��̵�����ɵĸ�ֵ
 * 
 * ʵ�������Ǵ洢��JVM���ڴ��java������ڲ�
 *
 */
public class ConstructorTest02 {

	public static void main(String[] args) {
		
		// ��myeclipse������ô�鿴���ʵ����ĸ����ԣ��鿴���ʵ����ĸ�������
		// ��ctrl��������ƶ����鿴��Ԫ���ϣ������»��ߵ�ʱ�򣬿�ʼ��������
		// ���⣬��һ���൱�У�Ԫ�ع����ʱ���ڵ�ǰ��������λ��ʹ��ctrl + o��ݼ���Ȼ������Ҫ���ҵ�Ԫ�����ƣ������Ʋ�һ��Ҫ����ȫ����
		// ��������
		Account act1 = new Account();
		
		System.out.println("�˺�" + act1.getActno());
		System.out.println("���" + act1.getBalance());
		
		
		Account act2 = new Account("110");
		
		System.out.println("�˺�" + act2.getActno()); // 110 
		System.out.println("���" + act2.getBalance()); // 0.0

		Account act3 = new Account(10000.0);
		
		System.out.println("�˺�" + act3.getActno()); // null 
		System.out.println("���" + act3.getBalance()); // 10000.0
		
		Account act4 = new Account("act-001",10000.0);
		
		System.out.println("�˺�" + act4.getActno()); // act-001 
		System.out.println("���" + act4.getBalance()); // 10000.0
		
	}
}
