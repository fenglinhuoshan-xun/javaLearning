/*
	ʹ��whileѭ�����1 ~ 10
*/

public class WhileTest02{

	public static void main(String[] args){
		
		int i = 1;
		while(i <= 10){
			System.out.println(i);
			i += 1;
		}
		System.out.println("end --> " + i); // 1

		System.out.println("-----------------------------------------------");

		int j = 100;
		while(j > 0){
			System.out.println(j--);
		}
		System.out.println("end j --> " + j); // 0

		System.out.println("-----------------------------------------------");

		int k = 100;
		while(k >= 0){
			System.out.println(--k);
		}
		System.out.println("end k --> " + k); // -1
	}
}

