/*
	关于java中的变量：
		变量的作用域
			1. 什么是作用域？
				-- 变量的作用域，其实描述的就是变量的有效范围
				-- 在什么范围之内是可以被访问的，只要出了这个范围，该变量就无法访问了

			2. 变量的作用域只要记住一句话：
				出了大括号就不认识了
*/
public class VarTest03{

	static int k = 90;

	public static void main(String[] args){

		// 变量i的作用域是main方法
		// 在整个main方法当中是有效的，可见的，可以访问的
		int i = 100;

		System.out.println(i); // 可以
		System.out.println(k); // 可以

		// 以下会编写一个for循环语句
		for (int a=0;a<10;a++){ // a变量的作用域是整个for循环，for循环结束之后，a变量的内存就释放了
		}

		// 这里无法访问a变量
		// System.out.println(a);

		int j;

		for (j=0;j<10;j++){
		}

		System.out.println(j); // 访问的是main方法中的j变量
		
	}
	
	public static void dosome(){
		
		// 这里无法访问main方法当中的变量i
		// 已经出了i变量的作用域
		// System.out.println(i);

		// 可以
		System.out.println(k);
	}
}