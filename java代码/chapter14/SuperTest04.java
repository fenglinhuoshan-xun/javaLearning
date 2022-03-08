/*
	程序执行结果：
		张三
		张三正在购物！
		张三正在购物！
		张三正在购物！
*/
public class SuperTest04{

	public static void main(String[] args){
		Vip v = new Vip("张三");
		System.out.println(v.name);
		v.shopping();
		
	}
}

class Customer{
	String name;

	public Customer(){
		
	}

	public Customer(String name){
		this.name = name;
	}
}

class Vip extends Customer{
	// 继承过来的name是父类型特征的name属性
	public Vip(){
		
	}

	public Vip(String name){
		super(name);
		// this.name = name; // 是自己的name属性
	}

	// super和this都不能出现在静态方法当中
	public void shopping(){
		// this表示当前对象
		System.out.println(this.name + "正在购物！");
		// super表示的是当前对象的父类型特征。（super是this指向的那个对象中的一块空间）
		System.out.println(super.name + "正在购物！");
		// 实例方法中的局部变量前面如果什么也没有的话，默认加this，即name = this.name
		System.out.println(name + "正在购物！");
		
	}
}
