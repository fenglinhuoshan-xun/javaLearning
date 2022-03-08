/*
	在前一个程序的基础之上，计算1~100所有奇数的和
		1 + 3 + 5 + 7 + ... + 99 累加
*/

public class ForTest05{

	public static void main(String[] args){

		int sum = 0;
		for(int i=1; i<=100; i+=2){
			// i一定是奇数
			sum += i;

		}

		System.out.println(sum);
	
		// ---------------------------------------

		// 归零
		sum = 0;
		for(int i=1; i<=100; i++){
			if(i % 2 == 1){
				sum += i;
			}
		}

		System.out.println(sum);
	}
}