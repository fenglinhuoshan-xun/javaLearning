/*
	循环语句和条件判断语句嵌套使用【for和if的嵌套】	
*/

public class ForTest04{

	public static void main(String[] args){
		
		// 找出1~100所有的奇数
		// 第一种方案：从1开始，每次递增2，这样子每一个数字一定是奇数
		for(int i=1; i<=100; i+=2){
			System.out.println(i);
		}

		// 第二种方案：从1开始，以1递增，每一个数据都进行判断，判断标准是该数字对2取余数
		for(int i=1; i<=100; i++){
			if(i % 2 == 1){
				System.out.println(i);
			}
		}

		// 以上两种方案，优先选择第一种方案，代码少，循环次数少，效率较高

	}
}

