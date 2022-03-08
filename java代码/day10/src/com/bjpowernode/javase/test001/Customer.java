package com.bjpowernode.javase.test001;

/**
 * 关于java语言当中的this关键字
 * 	1. this是一个关键字，翻译为：这个
 * 	2. this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身对象，this存储在JVM堆内存java对象内部
 * 	3. 创建100个java对象，每一个对象都有this，也就是说有100个不同的this
 * 	4. this可以出现在“实例方法”当中，指向当前正在执行动作/方法的对象（this代表当前对象）
 * 	5. this在多数情况下，是可以省略不写的
 * 	6. this不能使用在带有static的方法当中 
 */
public class Customer {
	
	// 姓名【堆内存的对象内部存储，所以访问该数据的时候，必须先创建对象，通过引用的方式访问】
	String name; // 实例变量：必须采用“引用.”的方式访问
	
	// 构造方法;
	
	public Customer() {
		
	}
	
	// 不带static关键字的方法
	// 顾客购物的行为
	// 每一个顾客的购物，最终的结果是不一样的
	// 所以购物这个行为是对象级别的行为
	// 由于每一个对象在执行购物这个动作的时候，最终结果不同，所以购物这个动作必须有“对象”的参与
	// 没有static关键字的方法被称为“实例方法”，实例方法怎么访问？“引用.”
	// 重点：没有static关键字的变量被称为“实例变量”
	// 注意：当一个行为/动作执行的过程当中是需要对象参与的，那么这个方法一定要定义为“实例方法”，不要带static关键字
	// 以下方法定义为实例方法，因为每一个顾客在真正购物的时候，最终的结果是不同的，所以这个动作在完成的时候，必须有对象的参与
	public void shopping() {
		
		// 由于name是一个实例变量，所以这个name访问的时候，一定访问的是当前对象的name，所以多数情况下“this.”是可以省略的
		// System.out.println(name + "在购物"); // 这样写也可以，正常是通过“引用.”的方式来访问实例变量name
		
		// 完整的写法
		System.out.println(this.name + "在购物");
	}
	
	// 带有static
	public static void doSome() {
		// 这个执行过程当中“当前对象”，因为带有static的方法是通过类名.的方式去访问的
		// 或者说这个“上下文”当中没有“当前对象”，自然也不存在this（this代表的是当前正在执行这个动作的对象）
		
		// 以下程序为什么编译错误呢？
		// doSome方法的调用不是对象去调用，是类名去调用，执行过程中没有“当前对象”
		// name是一个实例变量，以下的代码含义是：访问当前对象的name，没有当前对象，自然也不能访问当前对象的name
		// System.out.println(name);
		
		// static的方法当中调用不需要对象，直接使用类名。所有执行过程中没有当前对象，所有不能使用this
		// System.out.println(this);
	}
	
	public static void doOther() {
		// 假设想访问name这个实例变量的话，应该怎么访问？
		// System.out.println(name); // 编译报错
		
		// 可以采用以下方案，但是以下方案，绝对不是访问的当前对象的name
		// 创建对象
		Customer c = new Customer();
		System.out.println(c.name);
	}

}
