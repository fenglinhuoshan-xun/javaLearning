/*
	使用for循环输出九九乘法表：
		
	1*1=1
	1*2=2	2*2=4
	1*3=3	2*3=6	3*3=9
	1*4=4	2*4=8	3*4=12	4*4=16
	...
	1*9=9	.................................9*9=81
*/


public class ForTest08{

	public static void main(String[] args){
		
		/*
		for(int i=1; i<=9; i++){

			int j=i;
			for(; j<=9; j++){
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		*/

		for(int i=1; i<=9; i++){
;
			for(int j=1; j<=i; j++){
				System.out.print(j + " * " + i + " = " + (i * j));
				System.out.print("	"); // 制表符，空格会导致对不齐
			}
			System.out.println();
		}
		
	}
}