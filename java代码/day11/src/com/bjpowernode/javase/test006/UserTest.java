package com.bjpowernode.javase.test006;

import com.bjpowernode.javase.test005.User;

public class UserTest {
	
	public static void main(String[] args) {
		
		User u = new User();
		System.out.println(u.i); // 报错
		System.out.println(u.j); // 报错
		
		u.m3(); // 报错
		u.m4(); // 报错
	}
}
