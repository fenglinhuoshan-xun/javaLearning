/*
	
*/

public class ForTest02{

	public static void main(String[] args){
		
		// 以下的for循环当中的i变量的作用域是仅限于当前for循环内部使用
		for(int i=0; i<10; i+=1){
			System.out.println("i --> " + i);
		}

		// 以下的for循环当中的i变量的作用域是仅限于当前for循环内部使用
		for(int i=0; i<=10; i++){
			System.out.println("i -->" + i);
		}

		// 这个i变量可以在main方法的作用域当中访问吗？无法访问
		// System.out.println("i = " + i); // 编译错误：找不到符合

		// main方法作用域当中的i变量，只要main方法没有结束，这里的i就能用
		int i = 0;
		for(; i<10; i++){
			System.out.println("i = " + i); 
		}

		// 这里可以访问main方法作用域当中的i变量
		System.out.println("i ======> " + i); // 10

		int j;
		for(j = 1; j < 10; j++){
			System.out.println("j --> " + j);
		}

		System.out.println(j); // 10
	}
}