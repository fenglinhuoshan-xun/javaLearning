/*
	当前以下的程序不使用“方法”，分析程序存在哪些缺点？
		1. 以下的代码都是完成两个int类型数据的和，相同的代码写了三遍，代码没有得到重复使用

		2. 应该在java语言当中有这样的一种机制：
			-- 某个功能代码只需要写一遍
			-- 要使用这个功能，只需要给这个功能传递具体的数据
			-- 这个功能完成之后，返回一个最终的结果
			这样代码就可以重复利用了，提高代码复用性【 这就是“方法”】
			
		3. 使用这个方法，我们称为“调用/invoke”
			
*/

public class MethodTest01{

	public static void main(String[] args){
		
		// 需求1：请编写程序，计算10和20的和，并将程序输出
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);

		// 需求2：请编写程序，计算666和888的和，并将结果输出
		int x = 666;
		int y = 888;
		int z = x + y;
		System.out.println(x + " + " + y + " = " + z);

		// 需求3：请编写程序，计算111和222的和，并将结果输出
		int m = 111;
		int n = 222;
		int e = m + n;
		System.out.println(m + " + " + n + " = " + e);

		// 以上的上需求，其实就是一个需求，这个需求是：计算两个int类型的数据的和，功能相同，只不过每次参与计算的数据不同

	}
}