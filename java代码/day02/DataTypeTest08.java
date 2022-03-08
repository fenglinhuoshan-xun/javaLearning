/*
	关于基本数据类型之间的互相转换：转换规则
		1. 八种基本数据类型当中，除布尔数据类型之外，剩下的7种数据类型之间都可以互相转换
		2. 小容量向大容量转换，称为自动类型转换，容量从小到大排序：
			byte < short < int < long < float < double 
				 < char <
			注意：
				-- 任何浮点型不管占用多少个字节，都比整数型容量大
				-- char和short平级，可表示的种类数量相同，但是char可以取更大的正整数
			
		3. 大容量转换成小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，但是在运行阶段可能会损失精度，所以谨慎使用

		4. 当整数字面值没有超出byte,short,char的取值范围时，可以直接赋值给byte,short,char类型的变量

		5. byte,short,char混合运算的时候，各自先转换成int类型，再做运算

		6. 多种数据类型混合运算，先转换成容量最大的那种类型再做运算

		注意：编译期不会进行运算，只会检查语法

			
*/

public class DataTypeTest08{

	public static void main(String[] args){
		
		char c = 97; // 97未超过char类型的取值范围，所有编译通过，不报错
		System.out.println(c); // a

		// 出现错误，1000超出了byte的范围
		// byte a = 1000;

		// 正确，因为20没有超出byte的范围
		// byte a = 20;

		// 变量不能重名
		// short a = 1000;

		// 正确，1000没有超过short类型的范围
		// short b = 1000;

		// 正确，默认就是int，并且没有超出int范围
		// int c = 1000;

		// 正确，可以自动转换
		// long d = 1000;

		// 错误，出现精度丢失问题，大类型 --> 小类型，会出现问题
		// int e = d;

		// 将long强制转换成int类型
		// 1000没有超出int范围，所有是正确的
		// int e = (int)d;

		// 因为java中的运算会转成最大类型
		// 10和3默认为int类型，所有运算后的最大类型也是int
		// 所有是正确的
		int f = 10/3; // 10/3的结果是3

		// 声明10为long类型
		long g = 10;

		// 最大类型为double，而h为int类型，大类型 --> 小类型的转换，将会出现精度损失
		// 报错
		// int h = g/3;
		// 可以强制类型转换，因为运算结果没有超过int范围
		// 先将g转为int类型，再和3运算
		// int h = (int)g/3;

		// 正确
		long h = g/3;

		// 错误
		// g转换为int，再转换为byte，最后byte类型的g和3运算，最后运算结果是int类型，int类型赋值给byte，会出现精度损失
		// byte h = (byte)(int)g/3;

		// 正确
		// byte h = (byte)(int)(g/3);

		// 错误
		// byte h = (byte)g/3;

		// 正确，因为运算结果没有超出byte范围
		// byte h = (byte)(g/3);

		short i = 10;
		byte j = 5;

		// 错误，short和byte运算，首先会转换成int再运算
		// 所有运算结果为int，int赋值给short，会出现精度损失问题
		short k = i + j;

		// 可以强制转换
		short k = (short)(i + j);

		// 正确
		int k = i + j;

		char l = 'a';
		System.out.println(l); // a
		System.out.println((byte)l); // 97

		int m = l + 100;
		System.out.println(m); // 197

		double dd = 10 / 3;
		System.out.println(dd); // 3.0

		dd = 10.0 / 3;
		System.out.println(dd); // 3.3333333333333335

	}
}