/*
	�жϳ����ִ�н����
	1 3 6 5 4
	��java�����У�������newʲô������������ڵ�Object����޲ι��췽��һ����ִ�У�Object����޲������췽���Ǵ��ڡ�ջ��������

	ջ�����ص㣺
		-- �����ã���������ִ�н���
		-- ����ȳ�
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