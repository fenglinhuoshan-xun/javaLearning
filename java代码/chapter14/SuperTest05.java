/*
	1. “this.”和“super.”在大部分情况下都是可以省略的
	2. this.什么时候不能省略？
		public void setName(String name){
			this.name = name;
		}
	3. super.什么时候不能省略？
		父中有，子中又有，如果想在子中访问“父的特征”（即如果想在子对象中访问父类型的同名属性时），super.不能省略
*/

/*
	程序执行结果：
		null正在购物！
		张三正在购物！
		null正在购物！
		张三doSome!
		张三doSome!
*/

public class SuperTest05{

	public static void main(String[] args){
		Vip v = new Vip("张三");
		v.shopping();

		v.doSome();
		
	}
}

class Customer{
	String name;

	public Customer(){
		
	}

	public Customer(String name){
		this.name = name;
	}

	public void doSome(){
		System.out.println(this.name + "doSome!");
		System.out.println(name + "doSome!");
		// 错误，找不到符号
		// System.out.println(super.name + "doSome!");
	}
}

class Vip extends Customer{

	// 假设子类也有一个同名属性
	// java中允许在子类中出现和父类一样的同名变量/同名属性
	String name; // 实例变量，对象级别的变量

	public Vip(){
		
	}

	public Vip(String name){
		super(name);
		// this.name = null;
	}

	// super和this都不能出现在静态方法当中
	public void shopping(){

		/*
			java是怎么来区分子类和父类的同名属性的？
				this.name：当前对象的name属性
				super.name：当前对象的父类型特征中的name属性
		*/

		// this表示当前对象
		System.out.println(this.name + "正在购物！");
		// super表示的是当前对象的父类型特征。（super是this指向的那个对象中的一块空间）
		System.out.println(super.name + "正在购物！"); 
		// 实例方法中的局部变量前面如果什么也没有的话，默认加this，即name = this.name
		System.out.println(name + "正在购物！");
		
	}
}
