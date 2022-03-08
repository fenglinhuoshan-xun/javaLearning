/*
	判断程序的执行结果：
	1 3 6 5 4
	在java语言中，不管是new什么对象，最好老祖宗的Object类的无参构造方法一定会执行（Object类的无参数构造方法是处于“栈顶部”）

	栈顶的特点：
		-- 最后调用，但是最先执行结束
		-- 后进先出
*/

public class SuperTest02{
	public static void main(String[] args){

		new C();
		
	}
}

/*
class Object{
	public Object{
		
	}
}
*/

class A extends Object{
	public A(){
		System.out.println("1");
	}

}

class B extends A{
	public B(){
		System.out.println("2");
	}

	public B(String name){
		System.out.println("3");
	}

}

class C extends B{
	public C(){

		this("zhangsan");
		System.out.println("4");
	}

	public C(String name){
		this(name,20);
		System.out.println("5");
	}

	public C(String name, int age){
		super(name);
		System.out.println("6");		
	}


}