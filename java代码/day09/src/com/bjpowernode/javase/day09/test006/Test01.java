package com.bjpowernode.javase.day09.test006;

/**
 * java语言当中，方法调用的时候，涉及到参数传递的问题，参数实际上传递的是变量中保存的值
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		int i = 10;
		add(i); // add方法调用的时候，给add方法传递了一个变量i，到底传的是什么？
		System.out.println("main --> " + i);
	}
	
	public static void add(int i) {
		i++;
		System.out.println("add --> " + i);
	}

}
