package com.bjpowernode.javase.day11;

public class Test02{

	public static void main(String[] args){
		
		// 完整类名：com.bjpowernode.javase.day11.Test01 
		com.bjpowernode.javase.day11.Test01 t = new com.bjpowernode.javase.day11.Test01();
		System.out.println(t); // com.bjpowernode.javase.day11.Test01@15db9742

		// 可以省略包名，因为Test01类和Test02类在同一个软件包下
		Test01 tt = new Test01(); 
		System.out.println(tt); // com.bjpowernode.javase.day11.Test01@6d06d69c
	}
}