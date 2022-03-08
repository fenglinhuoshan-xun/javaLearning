package com.bjpowernode.javase.test012;

public class ExtendsTest2 {
	
	public static void main(String[] args) {
		C c = new C();
		// 这里调用的doSome方法是从B类中继承过来的doSome方法
		c.doSome(); // ---do some!---
	}
}

class A{
	public void doSome() {
		System.out.println("do some!");
	}
}

class B extends A{
	public void doSome() {
		System.out.println("---do some!---");
	}
}

class C extends B{
	
}

