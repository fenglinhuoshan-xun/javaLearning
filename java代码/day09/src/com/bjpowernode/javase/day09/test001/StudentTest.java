package com.bjpowernode.javase.day09.test001;

/**
 * ѧ��������
 * @author PC
 *
 */
public class StudentTest {

	// main�����Զ���ȫ
	// ����main��alt + /���س�����
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// ����ѧ������
		Student s = new Student();
		
		// ����ѧ�����������
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.addr);
		System.out.println(s.sex);
		
		// ʵ����������ֱ�Ӳ��������ķ�ʽ����
		// System.out.println(Student.no);
		
		s.no = 10;
		s.name = "����";
		System.out.println("ѧ�ţ�" + s.no);
		System.out.println("������" + s.name);
		
		
		// ����ѧ������
		Student lisi = new Student();
		lisi.name = "����";
		System.out.println(lisi.name);
	}

}
