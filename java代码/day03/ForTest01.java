/*
	1. 循环结构：在程序当中，总有一些代码需要反复的执行，假设没有循环结构，那么这段需要重复执行的代码自然是需要重复编写的，代码无法得到重复使用，所以多数编程语言都是支持循环结构的，将来把需要反复执行的代码片段放到“循环体”中，再联合计数器，共同控制这段需要反复执行的代码

	2. 基本上，所有的编程语言，支持的循环包括三种：
		* for循环
		* while循环
		* do..while循环

	3. 当前示例主要讲解for循环，for循环的语法结构是什么呢？
		语法结构：
			for( 初始化表达式 ; 布尔表达式 ; 更新表达式 ){
				// 是需要反复执行的代码片段【即循环体：由java语句组成】
			}

	4. for循环的执行过程/执行原理？【*****】
		-- 初始化表达式、布尔表达式、更新表达式都不是必须的！【但是两个分号是必须的】
		-- 初始化表达式最先执行，并且在整个for循环当中只执行一次
		-- 布尔表达式必须是true/false，不能是其他值
		-- for的执行过程：
			* 先执行初始化表达式，并且该表达式只执行一次
			* 判断布尔表达式的结果是true还是false
				布尔表达式为true时
					* 执行循环体
					* 执行完循环体后，执行更新表达式
					* 执行完更新表达式之后，判断布尔表达式的结果是true还是false
						-- 布尔表达式为true
							* 执行循环体
							* 执行完循环体后，执行更新表达式
							* 执行完更新表达式之后，判断布尔表达式的结果是true还是false		
							...

						-- 布尔表达式为false
							循环结束

				布尔表达式为false时
					循环结束



*/

public class ForTest01{

	public static void main(String[] args){
		
		// 需求：使用循环结构输出数字1~10
		for(int i = 1; i < 11; i += 1){

			System.out.println(i);
		}

		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}

		// 死循环
		for(;;){
			System.out.println("死循环");
		}
	}
}