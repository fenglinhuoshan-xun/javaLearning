/*
	假设系统给定考生成绩，请判断该考生的成绩等级：
		1. 有效成绩范围：[0~100]
		2. 考试成绩可能带有小数
		3. 考试成绩和等级之间的对照关系：
			[90 ~ 100]	A 
			[80 ~ 90]	B
			[70 ~ 80]	C 
			[60 ~ 70]	D
			[0 ~ 60]	E
		4. 以上需求必须采用switch语句来完成，不能采用if

		窍门：(int)(成绩/10)
		0、1、2、3、4、5、6、7、8、9、10
*/

public class SwitchTest05{

	public static void main(String[] args){
		
		// 考生的成绩
		// double score = 95.5;
		// double score = 100;
		// double score = 60.5;
		double score = 59.9;

		// 转换成int
		int grade = (int)(score/10);

		switch(grade){
			case 9 : case 10 :
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			case 6 :
				System.out.println("D");
				break;
			default :
				System.out.println("E");

		}
	}
}