package com.bjpowernode.javase.day09.test002;

public class Test {
	
	public static void main(String[] args) {
		
		// ����һ���ɷ����
		Husband xiaoMing = new Husband();
		xiaoMing.name = "С��";
		// �������Ӷ���
		Wife xiaoGang = new Wife();
		xiaoGang.name = "С��";
		// ���
		xiaoMing.wife = xiaoGang;
		xiaoGang.husband = xiaoMing;
		
		System.out.println(xiaoMing.wife.name);
		System.out.println(xiaoGang.husband.name);
	}

}
