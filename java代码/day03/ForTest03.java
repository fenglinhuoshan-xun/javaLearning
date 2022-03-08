public class ForTest03{

	public static void main(String[] args){
		
		// 输出1~10中所有的奇数
		for(int i=1; i<=10; i+=2){
			System.out.println("i --> " + i); // 1 3 5 7 9 
		}

		// 输出1~10中所有的偶数
		for(int i=2; i<=10; i+=2){
			System.out.println("i --> " + i);
		}

		for(int i=10; i>0; i--){
			System.out.println("i ===> " + i); // 10 9 8 7 6 5 4 3 2 1
		}

		for(int i=0; i<10;){
			System.out.println("i ===>> " + i);
			i++; // i++可以写到这，即循环体的最后面
		}

		for(int i=0; i<10;){ // 死循环
			System.out.println("i ===>> " + i);
		}

		for(int i=0; i<10;){
			i++;
			System.out.println("i ===>> " + i); // 1 2 3 4 5 6 7 8 9 10
		}


	}
}