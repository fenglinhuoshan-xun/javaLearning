/*
	画图分析以下程序的执行过程
*/

public class MethodTest13{

	public static void main(String[] args){
		
		int i = 10;
		System.out.println("i --> " + i); // 10
	}

	public static void method(int i){
		
		i++;
		System.out.println("method --> " + i);
	}
}