/*
	continue语句：
		1. continue表示：继续/go on/下一个

		2. continue也是下一个continue关键字加一个分号，构成一个单独的完整的java语句，主要出现循环语句当中，用来控制循环的执行

		3. break和continue的区别？
			* break表示循环不执行了
			* continue表示终止当前“本次”循环，直接进入下一次循环，继续执行

		4. continue也有这样的说法：
			continue 循环名称; 【作为了解内容】
*/

public class ContinueTest01{

	public static void main(String[] args){
		
		for(int i = 0; i < 10; i ++){
			if(i == 5){
				break;
			}
			System.out.println("i = " + i); // 0 1 2 3 4
		}

		System.out.println("Hello World");

		for(int i = 0; i < 10; i ++){
			if(i == 5){
				continue; // 只要这个语句执行，当前本次循环停止，直接进入下一次循环“继续”执行
			}
			System.out.println("i = " + i); // 0 1 2 3 4 6 7 8 9 10
		}

		System.out.println("Hello World");

		myfor:for(int i = 0; i < 10; i ++){
			if(i == 5){
				continue myfor; // continue后面可以指定循环名称，即下一次循环跳转到哪个循环中去执行
			}
			System.out.println("i = " + i); // 0 1 2 3 4 6 7 8 9 10
		}

		System.out.println("Hello World");
	}
}