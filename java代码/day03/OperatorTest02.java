/*
	关系运算符：
		>			大于
		>=			大于等于
		<			小于
		<=			小于等于
		==			等于
		!=			不等于

	注意：
		= 是赋值运算符
		== 是关系运算符
		关系运算符的运算结果一定是布尔类型：true/false

	关系运算符的运算原理：比较的是变量保存的值之间的关系比较
	后期你就懂了，变量里面可不一定存储的是一个值，不一定是一个基本数据类型的字面值，有可能是一个java对象的内存地址
*/

public class OperatorTest02{

	public static void main(String[] args){
		
		int a = 10;
		int b = 10;

		System.out.println(a > b); // false
		System.out.println(a >= b); // true
		System.out.println(a < b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // true
		System.out.println(a != b); // false
	}
}