/*
	关于方法的递归调用
		1. 什么是递归？
			方法自身调用自身
			递归有递推和回归两个过程

		2. 递归是很耗费栈内存的，递归算法可以不用的时候，尽量别用

		3. 以下程序运行的时候，发生了这样的一个错误【注意：是错误，不是异常】
			-- java.lang.StackOverflowError，表示栈内存溢出错误
			-- 错误发生无法挽回，只有一个结果，就是JVM结束工作

		4. 递归必须有结束条件，没有结束条件一定会发生栈内存溢出错误

		5. 递归即使有了结束条件，即使结束条件是正确的，有可能会发生栈内存溢出错误，因为递归的太深了

		注意：
			-- 递归可以不使用的话，尽量别用
			-- 但是有些情况下，该功能的实现必须依靠递归方式，如：目录拷贝
*/

public class RecursionTest01{

	public static void main(String[] args){
		
		System.out.println("main begin");
		doSome();
		System.out.println("main over");
	}

	// 以下的代码片段虽然只有一份，但是可以被重复调用，并且只要调用doSome方法，就会在栈内存中新分配一块所属的内存空间
	public static void doSome(){
		// System.out.println("doSome begin");
		doSome(); // 这行代码不结束，下一行程序是不能执行的
		// System.out.println("doSome over");
	}
}