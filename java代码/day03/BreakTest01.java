/*
	关于java控制语句当中的break语句：
		1. break是java语言当中的关键字，被翻译为“中断/折断”;

		2. break + ";" 可以成为一个单独的java语句：break;

		3. break语句使用在switch语句当中，用来终止switch语句的执行

		4. break语句同样可以使用在循环语句当中，用来终止循环的执行

		5. break终止哪个循环呢？

		6. break;语句使用在for,while,do..while循环语句当中，用来跳出循环，终止循环的执行，因为当程序循环到某个条件的时候，后续的循环没必要执行了，再执行也是耗费资源，所以可以终止循环，这样可以提高程序的执行效率

		7. 在默认情况下，break语句中断的是离它最近的循环语句，当然，也可以指定终止某个循环，需要给循环起名，采用这种语法：break 循环名称;

*/

public class BreakTest01{

	public static void main(String[] args){
		
		for(int i=0; i<10; i++){
			if(i == 5){
				break; // 终止的是当前的for循环
			}
			System.out.println(i); // 0 1 2 3 4
		}

		for(int j=0; j<3; j++){
			for(int i=0; i<10; i++){
				if(i == 5){
					break; // 终止的是内层的for循环，因为这个for离它最近，这里的break语句无法终止外层的for循环
				}
				System.out.println(i); // 	
			}
		}

		System.out.println("----------------------------------");

		// 以下语法使用较少
		// 给for循环起名for1
		for1:for(int j=0; j<3; j++){
			// 给for循环起名for2
			for2:for(int i=0; i<10; i++){
				if(i == 5){
					break for1; // 终止for1循环
				}
				System.out.println(i); // 0 1 2 3 4	
			}
		}


	}
}