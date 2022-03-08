package com.bjpowernode.javase.test004;

/**
 * “this.”什么时候不能省略？
 *	用来区分局部变量和实例变量的时候，不能省略，“this.”不能省略 
 */
// 用户类
public class User {
	
	// 属性私有化
	private int id;
	private String name;
	
	// 构造函数
	public User() {
		
	}
	
	/*
	public User(int a,String s) {
		id = a;
		name = s;
	}
	*/
	
	// 有了this，以后我们的构造方法可以这样写，见名知意
	public User(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	// setter and getter
	/*
	public void setId(int a) {
		id = a;
	}
	*/
	
	// java遵循就近原则
	// 以下程序的id与实例变量id无关，不能采用这种方式
	/*
	public void setId(int id) {
		id = id;
	}
	*/
	
	/*
	public void setId(int id) {
		// 等号后面的id，是局部变量id，等号前面的this.id是实例变量id
		this.id = id; 
	}
	*/
	
	// myeclipse自动生成的setter和getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
