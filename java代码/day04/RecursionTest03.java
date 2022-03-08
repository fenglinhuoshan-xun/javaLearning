/*
	使用递归计算1 ~ N的和
		-- 1 + 2 + 3 + ... + N
		-- N + (N - 1) + (N - 2) + ... + 1：建议采用这种方式
*/

public class RecursionTest03{

	static int sum = 0;

	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int n = s.nextInt();

		int retValue = sum(n);
		System.out.println(retValue);
	}

	// 单独的完成一个方法，这是一个独立的功能，可以完成1~N的和
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

	/*
	// 自己写的
	public static int sum(int n){
		sum += n;
		n--;
		if(n >= 1){
			return sum(n);
		}else{
			return sum;
		}
	}
	*/

	// 老师的
	public static int sum(int n){
		if(n == 1){
			return 1;
		}
		return n + sum(n - 1);
	}

}

// n + sum(n-1)
// n + (n-1) + sum(n-2);
// n + (n-1) + (n-2) + sum(n-3)
// ...
// n + (n-1) + (n-2) + ... + sum(1)
// n + (n-1) + (n-2) + ... + 1