/*
	关于java语言当中的if语句，属于选择结构，if语句又被称为分支语句/条件控制语句;
		1. if的语句结构：四种编写形式
			-- 第一种：
				if(布尔表达式){
					java语句;
					java语句;
					...
				}

			说：每一个if都是独立的，互不影响，每个if都会进行判断

			-- 第二种：
				if(布尔表达式){
					java语句;
					java语句;
					...
				}else{
					java语句;
					java语句;
					...
				}

			-- 第三种：
				if(布尔表达式){
					java语句;
					java语句;
					...					
				}else if(布尔表达式){
					java语句;
					java语句;
					...
				}else if(布尔表达式){
					java语句;
					java语句;
					...
				}else if(布尔表达式){
					java语句;
					java语句;
					...
				}...

			-- 第四种：
				if(布尔表达式){
					java语句;
					java语句;
					...					
				}else if(布尔表达式){
					java语句;
					java语句;
					...
				}else if(布尔表达式){
					java语句;
					java语句;
					...
				}else if(布尔表达式){
					java语句;
					java语句;
					...
				}else{
					java语句;
					java语句;
					...
				}

		2. 重点：对应java中的if语句来说，只要有一个分支执行，整个if语句全都结束
	
		3. 以上的第二种编写方式和第四种编写方式都带有else分支，这两种方式可以100%保证会有分支执行

		4. 所有的控制语句都是可以互相嵌套使用的，只要合理嵌套就行
			注意：嵌套使用的时候，代码格式要保证完美【该缩进的时候，必须要缩进，大部分情况下，被{}包围的内容，需要缩进】
			if(){
				if(){
					if(){
					
					}
				}
			}else{
				if(){
				
				}else{
					if(){
						if(){
						
						}
					}
				}
			}

		5. if语句的分支中如果只有一条java语句的话，大括号可以省略不写
			if(true/false){
				一条java语句;
			}

			if(true/false) 一条java语句; // 这种方式不推荐使用，但是要能看的懂

				
*/

public class IfTest01{

	public static void main(String[] args){

		// 需求：所在位置的五公里范围之内，有肯德基的话，去KFC吃午饭
		// 公里数
		double distance = 1.0; // 单位：KM
		// 判断语句\
		if(distance < 5){
			System.out.println("去KFC吃午饭！");
		}

		/*
			假设系统给定一个考生的成绩，成绩可能带有小数点
			根据学生的成绩判断该学生的等级
				[90 ~ 100]	A 
				[80 ~ 90]	B
				[70 ~ 80]	C 
				[60 ~ 70]	D
				[0 ~ 60]	E
			以上的逻辑判断采用if语句完成，应该怎么写？
		*/

		// 根据需求，决定选用第四种结构来完成
		/*
		double score = 0;

		if(score < 0 || score > 100){
			System.out.println("对不起，您提供的考生成绩不合法");
		}else if(90 <= score){
			System.out.println('A');
		} else if(80 <= score){
			System.out.println('B');
		}else if(70 <= score){
			System.out.println('C');
		}else if(60 <= score){
			System.out.println('D');
		}else{
			System.out.println('E');
		}
		*/


		double score = 101;

		String grade = "E";

		if(score < 0 || score > 100){
			grade = "对不起，您提供的成绩不合法";
		}else if(90 <= score){
			grade = "A";
		}else if(80 <= score){
			grade = "B";
		}else if(70 <= score){
			grade = "C";
		}else if(60 <= score){
			grade = "D";
		}

		System.out.println(grade);

	}
}

