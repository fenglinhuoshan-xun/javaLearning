package com.bjpowernode.javase.day09.test004;

public class CustomerTest {

	public static void main(String[] args) {

		Customer c = new Customer();

		// 私有的属性，不能在外部直接访问
		// c.id = 10;

		// 操作入口变成了只能通过set和get方法进行访问
		// 在set方法和get方法执行过程中，可以进行安全过滤
		c.setId(100);
		c.setName("张三");
		c.setAge(20);
		c.setAddr("北京大兴区");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAddr());
	}

}
