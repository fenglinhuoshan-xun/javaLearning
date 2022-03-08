/*
	先不使用递归，计算N的阶乘
	5的阶乘：5 * 4 * 3 * 2 * 1
*/

/*
public class RecursionTest04{

	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int n = s.nextInt();
		
		int retValue = method(n);
		System.out.println(retValue);
	}

	public static int method(int n){
		int multi = 1;
		for(int i=n; n>=1; n--){
			multi *= n;	
		}
		return multi;
	}
}
*/


// 使用递归方式
public class RecursionTest04{

	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int n = s.nextInt();
		
		int retValue = method(n);
		System.out.println(retValue);
	}

	public static int method(int n){
		if(n == 1){
			return 1;
		}
		return n * method(n - 1);
	}
}