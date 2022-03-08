/*
	方法重载：
		1. 方法重载又被称为：Overload

		2. 什么时候考虑方法重载？
			--  功能相似的时候，尽可能让方法名相同。但是，功能不同/不相似的时候，尽可能让方法名不同

		3. 什么条件满足之后，构成了方法重载？
			-- 在同一个类当中
			-- 方法名相同
			-- 参数列表不同
				* 数量不同
				* 顺序不同
				* 类型不同

		4. 方法重载和什么有关系？和什么没有关系？
			-- 方法重载和方法名、参数列表有关系。编译器只能通过方法名和参数列表来识别出不同的方法
			-- 方法重载和返回值类型无关，即编译器不能通过返回值来识别出方法的不同
			-- 方法重载和修饰符列表无关
			
*/

public class OverloadTest03{

	public static void main(String[] args){
		m1();
		m1(10);

		m2(1,2.0);
		m2(2.0,1);

		m3(10);
		m3(3.0);

		// m4(1,2);
		// m4(2,1);
	}

	// 以下两个方法构成重载
	public static void m1(){}
	public static void m1(int a){}

	// 以下两个方法构成重载
	public static void m2(int a, double b){}
	public static void m2(double a, int b){}

	// 以下两个方法构成重载
	public static void m3(int x){}
	public static void m3(double y){}

	// 编译错误：已在类中定义了方法
	// 以下不是方法重载，是发生了方法重复了
	/*
	public static void m4(int a, int b){}
	public static void m4(int b, int a){}
	*/

	// 编译报错：已在类中定义了方法
	/*
	public static void x(){
		
	}

	public static int x(){
		return 1;
	}
	*/

	// 编译报错：已在类中定义了方法
	/*
	void y(){
		
	}

	public static void y(){
		
	}
	*/
}