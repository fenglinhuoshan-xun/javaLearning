package com.bjpowernode.javase.day11;

public class Test02{

	public static void main(String[] args){
		
		// ����������com.bjpowernode.javase.day11.Test01 
		com.bjpowernode.javase.day11.Test01 t = new com.bjpowernode.javase.day11.Test01();
		System.out.println(t); // com.bjpowernode.javase.day11.Test01@15db9742

		// ����ʡ�԰�������ΪTest01���Test02����ͬһ���������
		Test01 tt = new Test01(); 
		System.out.println(tt); // com.bjpowernode.javase.day11.Test01@6d06d69c
	}
}