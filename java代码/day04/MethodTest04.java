/*
	�����ĵ��ò�һ����main�������У�Ҳ������������������
	ֻҪ�������ִ�е���λ�ã�������ȥ������������ 
*/

public class MethodTest04{

	public static void sum(int a, int b){
		
		System.out.println(a + " + " + b + " = " + (a + b));
		// ����doSome����
		MethodTest04.doSome();
	}

	public static void main(String[] args){
		
		MethodTest04.sum(1,2);

		System.out.println("Hello World");
	}

	public static void doSome(){
		System.out.println("do some!");
	}
	
}

