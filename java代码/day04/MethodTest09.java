/*
	深入return语句
		1. 带有return关键字的java语句只要执行，所在的方法执行结束

		2. 在同一个作用域当中，return语句下面不能编写任何代码，因为这些代码永远都执行不到，所以编译报错

*/

public class MethodTest09{

	public static void main(String[] args){

		/*
		int retValue = m();
		System.out.println(retValue);
		*/

		System.out.println(m());
		
	}


	// 编译报错：缺少返回语句，以下程序编译器认为，无法百分百保证 “return 1;” 语句会执行	
	/*
	public static int m(){
		int a = 10;
		if(a > 3){
			return 1;
		}
	}
	*/

	// 以下语句可以保证，一定会有一个return语句会执行，编译通过
	/*
	public static int m(){
		int a = 10;
		if(a > 3){
			return 1;
		}else{
			return 0;
		}
	}
	*/

	// 可以，和以上方法完全相同
	/*
	public static int m(){
		int a = 10;
		if(a > 3){
			return 1;
		}
		return 0;
	}
	*/

	/*
	public static int m(){
		int a = 10;
		if(a > 3){
			return 1;
			// System.out.println("Hello"); // 这里不能编写代码，编译器报错：无法访问的语句
		}
		System.out.println("Hello"); // 可以
		return 0;
		// System.out.println("Hello"); // 编译器报错：无法访问的语句
	}
	*/

	// 程序还可以这样写
	public static int m(){

		return 10 > 3 ? 1 : 0;
	}

}