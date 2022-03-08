/*
	不使用递归，计算1 ~ N的和【可以不用递归，尽量不用递归】
*/

public class RecursionTest02{

	static int sum = 0;

	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int n = s.nextInt();

		/*
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum += i;
		}
		System.out.println("sum = " + sum);
		*/

		int retValue = sum(n);
		System.out.println(retValue);

		// System.out.println(sum(1,n));
	}

	// 单独的完成一个方法，这是一个独立的功能，可以完成1~N的和
	public static int sum(int n){
		int result = 0;
		for(int i=1; i<=n; i++){
			result += i;
		}
		return result;
	}

	/*
	public static int sum(int a, int b){
		if(a<=b){
			sum += a;
			a++;
			int result = sum(a,b);
			return result;
		}else{
			return sum;
		}
	}
	*/
}