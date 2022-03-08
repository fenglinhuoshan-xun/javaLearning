package com.bjpowernode.javase.test009;

public class ChineseTest {

	public static void main(String[] args) {
		
		// 创建中国人对象1
		Chinese zhangsan = new Chinese("1","张三");
		System.out.println(zhangsan.id + "," + zhangsan.name + "," + Chinese.country);
		
		// 创建中国人对象2 
		Chinese lisi = new Chinese("2","李四");
		System.out.println(lisi.id + "," + lisi.name + "," + Chinese.country);
		
		// 创建中国人对象3
		Chinese wangwu = new Chinese("3","王五");
		System.out.println(wangwu.id + "," + wangwu.name + "," + Chinese.country);
		
		System.out.println(Chinese.country);
		System.out.println(zhangsan.country);
		zhangsan = null;
		// 所有静态的数据，都是可以采用“类名.”，也可以采用“引用.”，但是建议采用“类名.”的方式访问
		// 采用“引用.”的方式访问的时候，即使引用是null，也不会出现空指针异常，因为访问静态的数据不需要对象的存在
		System.out.println(zhangsan.country);
	}
}
