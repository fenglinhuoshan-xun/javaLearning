package com.bjpowernode;

public class Test03{

	public static void main(String[] args){
		
		// ����Test01����
		// ���´��������󣬵�ʡ�԰���֮�󣬻��ڵ�ǰ������Test01
		// ʵ���ϱ�����ȥ�ң�com.bjpowernode.Test01.class�ļ��ˣ�����಻����
		// Test01 tt = new Test01();
		// System.out.println(tt);

		// �޸����ϵĴ���
		// ������Ҫʡ�ԣ���Ӱ���
		// ���ۣ�ʲôʱ��ǰ��İ�������ʡ�أ�Test03��Test01��ͬһ�����µ�ʱ�򣬲���Ҫ�Ӱ���
		com.bjpowernode.javase.day11.Test01 tt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(tt); // com.bjpowernode.javase.day11.Test01@15db9742

		com.bjpowernode.javase.day11.Test01 ttt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(ttt); // com.bjpowernode.javase.day11.Test01@6d06d69c

		com.bjpowernode.javase.day11.Test01 tttt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(tttt); // com.bjpowernode.javase.day11.Test01@7852e922
	}
}