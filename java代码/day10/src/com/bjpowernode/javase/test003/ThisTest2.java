package com.bjpowernode.javase.test003;


public class ThisTest2 {

	// 实例变量
	String name;
	
	// 实例方法
	public void doSome() {
		System.out.println("do some!");
	}
	
	// 带有static
	public static void main(String[] args) {
		// System.out.println(name);
		// doSome();
		
		// System.out.println(this.name);
		// this.doSome();
		
		ThisTest2 tt = new ThisTest2();
		System.out.println(tt.name);
		tt.doSome();
	}

}
