package com.bjpowernode.javase.day09.test004;

/**
 * ��װ�Ĳ��裺 1. ��������˽�л���ʹ��private�ؼ��ֽ������Σ�private��ʾ˽�еģ����ε���������ֻ���ڱ����з���
 * 
 * 2. �����ṩ�򵥵Ĳ�����ڣ�Ҳ����˵�Ժ��ⲿ����Ҫ�����age���ԣ�����ͨ���򵥵���ڽ��з��ʣ� --
 * �����ṩ���������ķ������ֱ���set()������get()���� -- ���޸�age���ԣ�����set()���� -- ���ȡage���ԣ��͵���get()����
 * 
 * 3. set()�����������淶�� public void set+����������ĸ��д(�β�){ } eg�� public void setAge(int
 * a){ age = a; }
 * 
 * 4. get()�����������淶�� public ����ֵ���� get+��������ĸ��д(){ } eg�� public int getAge(){
 * return age; }
 * 
 * ����һ�£�һ������ͨ�����ʵ�ʱ�򣬰������ַ�����ʽ�� 1. ��һ�ַ�ʽ����ȡ������Ե�ֵ,��ȡget 2. �ڶ��ַ�ʽ���޸�������Ե�ֵ���޸�set
 * 
 * @author PC
 * 
 *         ��Ҫ�����ȱ����������ݣ� 1. setter �� getter����û��static�ؼ��� 2.
 *         ��static�ؼ������εķ�����ô���ã�����.������(ʵ��); 3. û��static�ؼ������εķ�����ô���ã�����.������(ʵ��);
 *
 */
public class User {

	// ����˽�л�
	private int age;

	// set()����û�з���ֵ����Ϊset()����ֻ�����޸�����
	/*
	 * public void setAge(int age) { age = age; //
	 * java�оͽ�ԭ��������ʵ��û�и�age���Ը�ֵ�������age���Ǿֲ�����age }
	 */

	// setter
	public void setAge(int a) {

		// ��дҵ���߼�������а�ȫ����
		// age = a;

		if (a < 0 || a > 150) {
			System.out.println("�Բ������ṩ�����䲻�Ϸ�");
			return;
		}

		// �������ִ�е�����Ļ���˵��a�����ǺϷ��ģ�����и�ֵ����
		age = a;
	}

	// getter
	public int getAge() {

		return age;
	}

}
