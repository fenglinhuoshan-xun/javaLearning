/*
	System.out.println(); // 负责向控制台输出【从内存到控制台】【输入的过程，这是从内存中出来了】

	接收用户键盘输入【从键盘到内存】【输入的过程，到内存中去】

	以下代码先不要问为什么？固定编写就可以接收用户键盘输入了

*/

public class KeyInputTest{

	public static void main(String[] args){
		
		//第一步：创建键盘扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 第二步：调用Scanner对象的next()方法，开始接收用户键盘输入
		// 程序执行到这里，会停下来，等待用户的输入
		// 当用户输入的时候，并且最终敲回车键的时候，输入的信息会自动赋值给userInputContent变量
		// 程序执行到这里，用户输入的信息，已经到内存中了
		// 接收文本，以字符串的形式接收
		// String userInputContent = s.next(); // 标识符的命名规范，见名知意

		// 将内存中的数据输出到控制台
		// System.out.println("您输入了：" + userInputContent);

		// 接收数字，以整数型int的形式来接收
		// 输入的必须是数字，如果是其他类型会报错
		int num  = s.nextInt();

		System.out.println("您输入的数字是：" + num);
		System.out.println("计算结果：" + (num + 100));
		
	}
}