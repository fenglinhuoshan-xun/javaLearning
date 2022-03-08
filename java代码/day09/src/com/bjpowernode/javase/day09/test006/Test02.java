package com.bjpowernode.javase.day09.test006;

/**
 * 方法最终结论：方法调用的时候，涉及到参数传递的时候，java只遵循一种语法机制，就是将变量中保存的“值”给传递过去，只不过这个值有时候是一个字面值，有时候是一个java对象的内存地址
 */
public class Test02 {

	public static void main(String[] args) {
		User u = new User(20);
		
		// 传递u给add方法的时候，实际上传递的是u变量中保存的值，只不过这个值是一个java对象的内存地址
		add(u); // ctrl + 1，回车即可自动生成方法
		System.out.println("main --> " + u.age); // 21
	}
	

	private static void add(User u) {
		// TODO Auto-generated method stub
		u.age++;
		System.out.println("add --> " + u.age); // 21
		
	}
}

class User{
	
	// 实例变量
	int age;
	
	// 构造方法
	public User(int i) {
		age = i;
	}
}
