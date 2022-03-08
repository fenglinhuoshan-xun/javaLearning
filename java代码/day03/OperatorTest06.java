/*
	三元运算符/三目运算符/条件运算符
		1. 语法规则：
			布尔表达式 ? 表达式1 : 表达式2

		2. 三元运算符的执行原理？
			当布尔表达式的结果是true的时候，选择表达式1作为整个表达式的执行结果
			当布尔表达式的结果是false的时候，选择表达式2作为整个表达式的执行结果
*/

public class OperatorTest06{

	public static void main(String[] args){
		
		// 编译报错：不是一个完整的java语句
		// 10;

		// 编译报错：不是一个完整的java语句
		// '男';

		// 布尔类型的变量
		boolean sex = false;

		//分析以下程序是否可以编译通过？
		// 编译报错，因为它不是一个完整的java语句
		// sex ? '男' : '女';

		char c = sex ? '男' : '女';
		// 可以编译通过
		System.out.println(c); // 女

		// 结果可能String，也可能char，但是前者不能用char来接收数据
		// 编译报错，不兼容的类型
		// char c1 = sex ? "男" : '女';

		System.out.println(10);
		System.out.println("10");
		System.out.println('1');

		// 可以
		System.out.println(sex ? '男' : '女');

		String s = sex ? "男的" : "女的";
		System.out.println(s);

	}
}

