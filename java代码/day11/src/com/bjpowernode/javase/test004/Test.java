package com.bjpowernode.javase.test004;

import java.util.Date;

// myeclipse导入类的快捷键：ctrl + shift + o
import com.bjpowernode.javase.test002.Cat;

public class Test {
	
	public static void main(String[] args) {
		
		// 编译错误
		// Cat c = new Cat();
		
		/*
		com.bjpowernode.javase.test002.Cat c = new com.bjpowernode.javase.test002.Cat();
		System.out.println(c);
		*/
		
		Cat c = new Cat();
		System.out.println(c);
		
		Date d = new Date();
		System.out.println(d);
		
	}

}
