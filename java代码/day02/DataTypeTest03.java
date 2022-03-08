/*
	关于java语言当中的char类型：
		转义字符 \ 
		转义：就是去其特殊化，让其变成普通字符
		转义字符出现在特殊字符之前，会将特殊字符转换成普通字符

		\n	换行符
		\t	制表符
		\'	普通的单引号
		\\	普通的反斜杠
		\"	普通的双引号
*/
public class DataTypeTest03{

	public static void main(String[] args){
		
		// 普通的n字符
		char c1 = 'n';
		System.out.println(c1);

		// 这是一个换行符，属于char类型的数据
		// 反斜杠在java语言当中具有转义功能
		char c2 = '\n';


		// System.out.print()和System.out.println()的区别；
		// println输出之后换行，print输出之后，不换行
		// System.out.print("Hello");
		// System.out.println("World!");

		System.out.print("A");
		System.out.println(c2);
		System.out.println("B");

		// 制表符tab键
		// 强调：制表符和空格不同，它们的ASCII码不同，体现在键盘上两个不同的按键
		char y = '\t';
		System.out.print("A");
		System.out.print(y);
		System.out.println("B");

		// 要求在控制台上输出反斜杠字符
		// 反斜杠将后面的单引号转义成一个普通的不具备任何含义的单引号字符，此时左边的单引号少了另外一半，缺少了结束的单引号字符，编译报错
		/*
		char k = '\';
		System.out.println(k);
		*/

		/*
			\\：
			解释：第一个反斜杠具有转义功能，将后面的反斜杠转义为普通的反斜杠字符
			结论：在java中，两个反斜杠表示一个普通的反斜杠字符
		*/
		char k = '\\';
		System.out.println(k);

		// 在控制台上输出单引号
		// char a = ''; // 编译报错：空字符文字。java中不允许这样写
		
		// char a = '''; //报错

		// 反斜杠具有转义功能，将第二个单引号转义成普通的单引号字符，第一个单引号和最后一个单引号配对
		char a = '\'';
		System.out.println(a);

		System.out.println("Hello World!");
		System.out.println("“Hello World!”");
		System.out.println("\"Hello World!\"");

		char m = '中';
		System.out.println(m);

		// JDK中自带的native2ascii.exe命令，可以将文字转换成Unicode编码形式。不过JDK9版本后，就没有这个命令了
		// 怎么使用这个命令？
		// 在命令行输入native2ascii，回车，然后输入文字之后，回车即可得到Unicode编码
		char n = '\u4e2d'; // '中'对应的Unicode编码是4e2d
		System.out.println(n);

		// char g = '4eud'; // 编译错误
		// char g = 'u4e2d'; // 编译错误
		// 通过：反斜杠和u联合起来，表示后面的一串数字，是某个文字的Unicode编码
		char g = '\u4e2d';
		System.out.println(g);

		// g = '\u456a';
		// g = '\u256a';
		g = '\u456b';
		System.out.println(g);

		// char类型的默认值
		char c = '\u0000';
		System.out.println(c); // 空白，什么都没有

	}
}

/*
	十进制：1 2 3 4 5 6 7 8 9 10 11 12 13 ...
	二进制；0 1 10 11 100 101 ...
	十六进制：0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20 ... 满十六进1
	八进制：0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20 ...
*/