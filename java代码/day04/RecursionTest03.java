/*
	ʹ�õݹ����1 ~ N�ĺ�
		-- 1 + 2 + 3 + ... + N
		-- N + (N - 1) + (N - 2) + ... + 1������������ַ�ʽ
*/

public class RecursionTest03{

	static int sum = 0;

	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("���������֣�");
		int n = s.nextInt();

		int retValue = sum(n);
		System.out.println(retValue);
	}

	// ���������һ������������һ�������Ĺ��ܣ��������1~N�ĺ�
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
	// �Լ�д��
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

	// ��ʦ��
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