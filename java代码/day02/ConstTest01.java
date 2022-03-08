/*
	关于字面值
		1. 字面值：即字表面的值
			-- 10、100
			-- 3.14
			-- "abc"
			-- 'a'
			-- true、false
		2. 字面值就是数据
		3. 字面值是java源程序的组成部分之一，包括标识符和关键字它们都是java源程序的组成部分
		4. 数据在现实世界中是分门别类的。所以数据在计算机编程语言当中也是有类型的【数据类型】
			-- 10、100属于整数型字面值
			-- 3.14属于浮点型字面值
			-- true、False属于布尔型字面值
			-- "abc"属于字符串型字面值
			-- 'A'属于字符型字面值
		5. 注意：
			-- java语言当中所有的字符串型字面值必须使用双引号括起来，双引号是半角
			-- java语言当中所有的字符型字面值必须使用单引号括起来，单引号是半角
*/
public class ConstTest01{
	public static void main(String[] args){
		System.out.println("abc");
		System.out.println("最近你过得怎么样？");
		System.out.println(10);
		System.out.println(false);
		System.out.println('A');
		System.out.println(3.14);

		// 编译报错，因为单引号中只能存放单个字符，属于字符型字面值
		// System.out.println('ABC');

		// 100是一个字面值，是一个整数型竖直，那么既然是数据存储在内存当中，必定会占用一定的内存空间
		System.out.println(11111100);
		System.out.println(11111100);
		System.out.println(11111100);
		System.out.println(11111100);

	}
}

