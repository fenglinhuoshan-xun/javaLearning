package com.bjpowernode.javase.test001;

public class Bird extends Animal{

	// 重写从父类中继承过来的方法
	public void move() {
		System.out.println("鸟儿在飞翔");
	}
	
	/**
	 * 子类对象特有的行为
	 */
	public void fly() {
		System.out.println("Bird fly");
	}
}


