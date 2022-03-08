package com.bjpowernode.javase.test006;

public class Test {
	
	// 带有static的方法
	public static void method1() {
		
		// 调用doSome
		// 使用完整方式调用
		Test.doSome();
		// 使用省略方式调用
		doSome();
		
		// 调用doOther
		// 使用完整方式调用
		Test tt = new Test();
		tt.doOther();
		// 使用省略方式调用
		
		// 调用i
		// 使用完整方式调用
		System.out.println(tt.i);
		// 使用省略方式调用
	}
	
	// 没有static的方法
	public void method2() {
		// 调用doSome
		// 使用完整方式调用
		Test.doSome();
		// 使用省略方式调用
		doSome();
		
		
		// 调用doOther
		// 使用完整方式调用
		this.doOther();
		// 使用省略方式调用
		doOther();
		
		// 调用i
		// 使用完整方式调用
		System.out.println(this.i);
		// 使用省略方式调用
		System.out.println(i);
		
	}
	
	// 主方法
	public static void main(String[] args) {
		// 要求在这里编写程序，调用method1()
		// 使用完整方式调用
		Test.method1();
		// 使用省略方式调用
		method1();
		
		// 要求在这里编写程序，调用method2()
		Test t = new Test();
		// 使用完整方式调用
		t.method2();
		// 使用省略方式调用
		
		
	}
	
	// 没有static的变量
	int i = 10;
	
	// 带有static的方法
	public static void doSome() {
		System.out.println("do some!");
	}
	
	// 没有static的方法
	public void doOther() {
		System.out.println("do Other");
	}

}
