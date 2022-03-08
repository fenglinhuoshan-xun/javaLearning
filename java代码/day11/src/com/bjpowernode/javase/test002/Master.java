package com.bjpowernode.javase.test002;

/**
 * 主人类
 */

// 这种方式没有使用java语言当中的多态机制，存在缺点：Master的扩展力很差，因为只要加一个新的宠物，Master类就需要添加一个新的方法
/*
public class Master {
	
	// 喂养宠物的方法	
	
	public void feed(Cat c) { // 面向具体编程
		c.eat();
	}
	
	public void feed(Dog d) { // 面向具体编程
		d.eat();
	}
}

// Master和Cat、Dog这两个类型的关联程度很强，耦合度很高，扩展力差
*/
	
// 降低程序的耦合度【解耦合】，提高程序的扩展力【软件开发的一个很重要的目标】
public class Master{
	
	// Master主人类面向的是一个抽象的Pet，不再面向具体的宠物
	// 提倡：面向抽象编程，不再面向具体编程
	// 面向抽象编程的好处是：耦合度低，扩展力强
	public void feed(Pet pet) { // pet是一个父类型的引用
		pet.eat();
	}
}




