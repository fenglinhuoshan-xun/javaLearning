package com.bjpowernode.javase.test003;

/**
 * 最终结论：
 * 	在带有static的方法当中，不能“直接”访问实例变量和实例方法，因为实例变量和实例方法都需要对象的的存在，而static的方法当中是没有this的，也就是说当前对象是不存在的，自然也就无法访问当前对象的实例变量和实例方法
 */
public class ThisTest {

	// 主方法
	// 带有static
	public static void main(String[] args) {
		
		// 调用doSome方法
		ThisTest.doSome();
		
		// 调用doSome方法
		doSome();
		
		// doOther是实例方法
		// 实例方法的调用必须有对象存在
		// 以下代码表示的含义：调用当前对象的doOther方法
		// 由于main方法中没有this，所以以下方法不能调用
		// doOther(); // 编译错误
		
		// 调用doOther方法
		// 实例方法必须先创建对象，通过引用.的方式访问
		ThisTest tt = new ThisTest();
		tt.doOther();
		
		tt.run();
		
		
	}
	
	// 带有static
	public static void doSome() {
		System.out.println("do some!");
	}
	
	// 实例方法
	public void doOther() {
		// this表示当前对象
		System.out.println("do other!");
	}
	
	// 实例方法
	// run是实例方法，调用run方法的一定是有对象存在的
	// 一定是先创建了一个对象，才能调用run方法
	public void run() {
		// 在大括号中的代码执行过程中，一定是有“当前对象的”
		// 也就是说，这里 一定有“this”
		System.out.println("run execute!");
		
		// doOther是一个实例方法，实例方法的调用必须有对象的存在
		// 以下代表表示的含义就是：调用当前对象的doOther方法
		doOther();
		// this.doOther();
	}
	
}
