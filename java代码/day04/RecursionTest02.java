/*
	��ʹ�õݹ飬����1 ~ N�ĺ͡����Բ��õݹ飬�������õݹ顿
*/

public class RecursionTest02{

	static int sum = 0;

	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("���������֣�");
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

	// ���������һ������������һ�������Ĺ��ܣ��������1~N�ĺ�
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