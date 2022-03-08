package com.bjpowernode.javase.test008;

/**
 * “中国人”类
 *
 */
public class Chinese {
	
	// 身份证号【每一个对象的身份证号不同】
	// 实例变量
	String id;
	
	// 姓名【每一个对象的姓名不同】
	// 实例变量
	String name;
	
	// 国籍【每一个对象由于都是由“Chinese类”实例化的，所以每一个中国人的国籍都是“中国”】
	// 无论通过Chinese类实例化多少个java对象，这些java对象的国籍都是“中国”
	// 实例变量【实例变量是一个java对象，就有一份，100个java对象，就有100个country】，分析这种设计方式有什么缺点？
	// 实例变量存储在java对象内部，堆内存当中，在构造方法执行的时候，完成初始化
	// 所有的中国人的国籍都是“中国”，这里声明为实例变量显然是不合适的，太浪费内存空间，没必要让每一个对象都保留一份“国籍”内存
	String country;
	
	// 构造函数
	public Chinese() {
		/*
		this.id = null;
		this.name = null;
		this.country = null;
		*/
	}
	
	public Chinese(String id,String name,String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

}
