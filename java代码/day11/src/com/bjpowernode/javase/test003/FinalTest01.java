package com.bjpowernode.javase.test003;

/**
 * 关于java语言当中的final关键字：
 * 	1. final是一个关键字，表示最终的，不可变的
 * 	2. final修饰的类无法被继承
 * 	3. final修饰的方法无法被覆盖
 * 	4. final修饰的变量一旦赋值之后，不可重新赋值【不可二次赋值】
 * 	5. final修饰的实例变量，必须手动赋值，不能采用系统默认值
 * 	6. final修饰的引用，一旦指向某个对象之后，则不能再指向其他对象，那么被指向的对象无法被垃圾回收器回收
 * 		final修饰的引用，虽然指向某个对象之后，不能再指向其他对象，但是所指向的对象内部的内存是可以被修改的
 * 	7. final修饰的实例变量，一般和static联合使用，被称为常量
 * 
 * 
 * 关于myeclipse怎么链接源码？
 * 	打开某个.class文件，当没有看到源码的时候，点击“Attached Sourse”:
 * 		-- WorkSpace【源码在当前的工作区当中】
 * 		-- External File...【源码在某个压缩包当中】
 * 		-- External Folder...【源码在某个目录当中】
 * 
 * 以后尽量所有的程序都链接源码，没有源码从网上找，或者跟老师要源码，养成看源代码的好习惯
 * 
 * 对于以后大家所学习的类库，一般都是包括三个部分的：
 * 	1. 源码【可以看源码来理解程序】
 * 	2. 字节码【程序开发的过程中，使用就是这部分】
 * 	3. 帮助文档【对源码的解释说明被提取出来，更方便程序的开发，对开发提供帮助】
 * 
 */
public class FinalTest01 {

	public static void main(String[] args) {
		
		// String newString = "aaabbcc".replaceAll("a", "x");
		// System.out.println(newString);
		
		int i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		
		final int k = 100;
		// 编译错误，无法为最终变量k分配值
		// k = 200; // 报错
		
		final int m;
		m = 200;
		// 编译错误，无法为最终变量k分配值
		// m = 300; // 报错
		
	}
}

/*
class MyString extends String{
	
}
*/



