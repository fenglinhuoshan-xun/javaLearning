/*
	需求：
		定义一个计算机类【电脑/笔记本】，计算机有哪些属性呢：
			* 品牌
			* 型号
			* 颜色
		定义一个学生类，学生类有哪些属性呢：
			* 学号 
			* 姓名
			* 学生有一台笔记本电脑

		请编写程序，来表示以上的类，分别将类创建为对象，对象数量不限，然后让其中的一个学生，去使用一台笔记本电脑
		编译并运行，并且让整个执行过程采用图形的方式描述出来

所有的代码全部写到当前的java源文件当中
*/

// 计算机类
class Computer{

	String brand;
	String model;
	String color;

}

// 学生类
class Student{

	String id;
	String name;
	Computer computer;
}


// 测试类
public class OOTest06{

	public static void main(String[] args){
		
		Student s01 = new Student();
		Computer c01 = new Computer();

		// 让这个学生和笔记本产生关联关系【通过学生能找到笔记本电脑】 
		s01.computer = c01;

		s01.name = "张三";
		c01.brand = "苹果";
		c01.model = "14英寸";
		c01.color = "银白色";

		System.out.println(s01.name + "使用的是：" + s01.computer.color + s01.computer.model + s01.computer.brand + "电脑");

	}
}







