package com.bjpowernode.javase.test002;

/**
 * ������
 */

// ���ַ�ʽû��ʹ��java���Ե��еĶ�̬���ƣ�����ȱ�㣺Master����չ���ܲ��ΪֻҪ��һ���µĳ��Master�����Ҫ���һ���µķ���
/*
public class Master {
	
	// ι������ķ���	
	
	public void feed(Cat c) { // ���������
		c.eat();
	}
	
	public void feed(Dog d) { // ���������
		d.eat();
	}
}

// Master��Cat��Dog���������͵Ĺ����̶Ⱥ�ǿ����϶Ⱥܸߣ���չ����
*/
	
// ���ͳ������϶ȡ�����ϡ�����߳������չ�������������һ������Ҫ��Ŀ�꡿
public class Master{
	
	// Master�������������һ�������Pet�������������ĳ���
	// �ᳫ����������̣��������������
	// ��������̵ĺô��ǣ���϶ȵͣ���չ��ǿ
	public void feed(Pet pet) { // pet��һ�������͵�����
		pet.eat();
	}
}




