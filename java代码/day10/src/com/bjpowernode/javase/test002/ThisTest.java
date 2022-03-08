package com.bjpowernode.javase.test002;

public class ThisTest {
	// 实例变量（引用.的方式访问）
	int num = 10;
	
	// 带有static的方法
	// JVM负责调用main方法，JVM是怎么调用的？
	// ThisTest.main(string[]);
	public static void main(String[] args) {
		
		// 没有当前对象的this
		
		// 以下代码什么意思？
		// 访问“当前对象”的num属性
		// System.out.println(num); // 编译报错
		
		// System.out.println(this.num); // 编译报错
		
		// 想访问num，怎么办？
		ThisTest tt = new ThisTest();
		System.out.println(tt.num);
		
	}

}
