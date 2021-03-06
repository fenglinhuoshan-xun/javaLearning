package com.bjpowernode.javase.test005;

/**
 * 访问控制权限修饰符：
 * 	1. 访问控制权限修饰符来控制元素的访问范围
 * 	2. 访问控制权限修饰符包括：
 * 		public			表示公开的，在任何位置都可以访问 
 * 		protected		同包下或者子类中可以访问
 * 		缺省（即什么都不写）				只是同包中可以访问
 * 		private			表示私有的，只能在本类中访问   
 * 
 * 	3. 访问控制权限修饰符可以修饰类、变量、方法...
 * 
 * 	4. 当某个数据只希望子类使用，使用protected进行修饰
 * 
 * 	5. 修饰符的范围：
 * 		private < 缺省 < protected < public
 */
public class Test01 {
	
	public static void main(String[] args) {
		User u = new User();
		System.out.println(u.i);
		System.out.println(u.j);
		
		u.m3();
		u.m4();
	}

}
