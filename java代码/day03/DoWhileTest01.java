/*
	do..while循环：
		1. do..while循环的语法结构：
			do{
				循环体
			}while(布尔表达式);

		2. do..while循环的执行原理：
			-- 先执行循环体
			-- 判断布尔表达式的结果：
				true：
					执行循环体
					判断布尔表达式的结果：
						...
				false：
					结束循环

		3. do..while循环的执行次数：
			do..while循环的循环体代码执行次数是：1 ~ N次【至少一次】

		4. 使用do..while循环的注意事项：
			do..while循环语句最终有一个分号，别丢了
*/

public class DoWhileTest01{

	public static void main(String[] args){
		
		int i = 10;
		do{
			System.out.println(i);
		}while(i > 100);

		int k = 1;
		do{
			System.out.println(k); // 1 ~ 10
			k++;
		}while(k <= 10);
	}
}

/*
	for
	while
	do..while
*/