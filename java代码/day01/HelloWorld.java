
// public：表示公开的
// class：表示定义一个类
// HelloWorld；表示一个类名
public class HelloWorld{ // 表示定义一个公开的类，起名Helloworld

	// 类体中不允许直接编写java语句【除声明变量之外】
	// System.out.println("Hello world!"); // 会报错

	// 类体【记住】
	/*
		public：表示公开的
		static：表示静态的
		void：表示空
		main：表示方法名是main
		(String[] args)：是一个main方法的形式参数列表

		需要记住的是：
			以下的方法是一个程序的“主方法”，是程序的执行入口
			是SUN公司规定的，固定编写方式，不这么写，程序进不来
	*/
	public static void main(String[] args){ // 表示定义一个公开的静态的主方法。args这个名字可以随便写
		// 方法体
		// 方法体
		// 方法体
		// 方法体
		// 方法体

		// java语句【java语句必须以;结尾，分号必须是半角分号，分号也是java语法的一部分】
		// java中所有字符串都要使用双引号括起来
		System.out.println("Hello world!"); // 向控制台输出一段消息

		// 再向控制台输出消息
		System.out.println("你好，杰克！");
		// 输出中文
		System.out.println("我是一个“程序员”"); // 程序员的双引号是全角的，不是java语法的一部分，只是个普通的字符串
	}
}