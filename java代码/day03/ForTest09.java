/*
	编写for循环，找出1~100之间所有的素数
	素数：又被称为质数，只能被1和自身整除，不能被其他数字整除的数字
*/

public class ForTest09{

	public static void main(String[] args){
		
		
		for(int i=2; i<=100; i++){
			int m = 0; //【标记在开发中比较常用】
			for(int j=2; j<i; j++){
				if(i % j == 0){
					m=1;
				}
			}

			/*
			if(m == 0){
				System.out.println(i);
			}
			*/

			System.out.println(m == 0 ? i + "是素数" : i + "不是素数");
		}
		

		/*
		升级版：
		编写for循环，找出1~10000中的所有素数
		要求：每8个换一行输出
		*/

		int n = 0;
		for(int i=2; i<=10000; i++){
			int m = 0;
			for(int j=2; j<i; j++){
				if(i % j == 0){
					m=1;
				}
			}
			if(m == 0){
				n += 1;
				System.out.print(i + "	");	
				if(n >= 8){
					System.out.println();
					// 归零
					n = 0;
				}

			}
		}
		
	}
}



