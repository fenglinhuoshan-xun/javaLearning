/*
	对象的创建和使用
*/

public class OOTest01{

	public static void main(String[] args){
		
		// int是基本数据类型
		// i是一个变量名
		// 10是一个int数据类型的字面值
		int i = 10;

		// 通过一个类可以实例化N个对象
		// 实例化对象的语法：new 类名();
		// new是java语言当中的一个运算符
		// new运算符的作用：创建对象，在JVM堆内存当中开辟新的内存空间
		// 方法区内存在类加载的时候，class字节码文件（代码片段）被加载到该内存空间当中
		// 栈内存（局部变量）：方法代码片段被调用执行的时候，会给该方法分配内存空间，在栈内存中压栈
		// 堆内存：new的对象，在堆内存中存储
		// Student1是一个引用数据类型
		// s是一个变量名
		// new Student1()是一个学生对象
		// s是一个局部变量【在栈内存中存储】
		// 什么是对象？new运算符在堆内存中开辟的内存空间，称为对象
		// 什么是引用？引用是一个变量，只不过这个变量中保存了另一个java对象的内存地址
		// 因为局部变量s中保存的是对象的内存地址，所以我们将s称为引用
		// java语言当中，程序员不能直接操作堆内存，java中没有指针，不像C语言
		// java语言当中，程序员只能通过“引用”去访问堆内存当中，对象内部的实例变量
		Student1 s = new Student1();

		// 访问实例变量的语法格式：
		// 读取数据：引用.变量名
		// 修改数据：引用.变量名 = 值

		int stuNO = s.no;
		String stuName = s.name;
		int stuAge = s.age;
		boolean stuSex = s.sex;
		String stuAddr = s.addr;

		/*
		System.out.println("学号 = " + stuNO); // 0
		System.out.println("姓名 = " + stuName); // null
		System.out.println("年龄 = " + stuAge); // 0
		System.out.println("性别 = " + stuSex); // false
		System.out.println("住址 = " + stuAddr); // null
		*/

		System.out.println("学号 = " + s.no); // 0
		System.out.println("姓名 = " + s.name); // null
		System.out.println("年龄 = " + s.age); // 0
		System.out.println("性别 = " + s.sex); // false
		System.out.println("住址 = " + s.addr); // null

		s.no = 10;
		s.name = "jack";
		s.age = 20;
		s.sex = true;
		s.addr = "北京";

		// 再通过类实例化一个全新的对象
		// stu是引用
		// stu同时也是一个局部变量
		// Student1是变量的数据类型
		Student1 stu = new Student1();
		System.out.println(stu.no); // 0
		System.out.println(stu.name); // null
		System.out.println(stu.age); // 0
		System.out.println(stu.sex); // false
		System.out.println(stu.addr); // null

		// 编译报错，no这个实例变量不能直接采用“类名”的方式访问
		// 因为no是实例变量，是对象级别的变量，变量存储在java对象的内部，必须先有对象
		// 通过对象才能访问no这个实例变量，不能直接通过“类名”访问
		// System.out.println(Student1.no); // 0
	}
}

// 成员变量没有手动赋值的话，系统赋默认值
// 默认值
/*
	数据类型				默认值
	------------------------------
	byte,short,int,long		0
	float,double			0.0
	boolean					false
	char					\u0000
	引用数据类型			null 空值
*/

/*
	局部变量在栈内存中存储
	成员变量中的实例变量在堆内存的对象内部存储

	并且实例变量是一个对象一份，100个对象就有100份
*/
