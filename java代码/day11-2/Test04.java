package org.apache;

/*
	import语句用来导入其他类，同一个包下的类，不需要导入，不在同一个包下需要手动导入
	
	import语法格式：
		import 类名;
		import 包名.*;

	import语句需要编写在package语句之下，class语句之上
*/

// import com.bjpowernode.javase.day11.Test01;

// import java.lang.String;

import com.bjpowernode.javase.day11.*;

import java.util.*;
import java.util.Date;

public class Test04{

	public static void main(String[] args){

		com.bjpowernode.javase.day11.Test01 tt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(tt); // com.bjpowernode.javase.day11.Test01@15db9742

		com.bjpowernode.javase.day11.Test01 ttt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(ttt); // com.bjpowernode.javase.day11.Test01@6d06d69c

		com.bjpowernode.javase.day11.Test01 tttt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(tttt); // com.bjpowernode.javase.day11.Test01@7852e922

		// 以上程序可以，就是麻烦一些
		Test01 x = new Test01();
		System.out.println(x); // com.bjpowernode.javase.day11.Test01@4e25154f

		Test01 y = new Test01();
		System.out.println(y); // com.bjpowernode.javase.day11.Test01@70dea4e

		String s = "abc";
		System.out.println(s);

		// java.lang.*;不需要手动引用，系统自动引入
		// lang：language语言包，是java语言的核心类，不需要手动引用
		java.lang.String str = "abc";
		System.out.println(str);

		// 直接编写以下代码，编译错误，因为Date类没有找到
		// Date d = new Date(); // 报错

		// java.util.Date d = new java.util.Date(); // 可以

		// 使用import语句之后：import java.util.Date
		Date d = new Date();

	}
}

/*
	最终结论：
		什么时候需要import？
			* 不是java.lang包下，并且不在同一个包下的时候，需要使用import进行引入
*/