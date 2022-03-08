/*
	需求：
		假设系统给定一个人的年龄，这个年龄需要从键盘输入
		根据年龄来判断这个人处于生命的哪个阶段，年龄必须在[0~150]
			[0~5]		幼儿
			[6~10]		少儿
			[11~18]		青少年
			[19~35]		青年
			[36~55]		中年
			[56~150]	老年

*/

public class IfTest02{

	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入您的年龄："); // 输出提示信息，要不然用户根本不知道这里要干嘛

		int age = s.nextInt(); // 停下来等待用户的输入，输入之后自动接收，赋值给age变量

		String stage = "幼儿";

		if(age < 0 || age > 150){
			stage = "您输入的年龄有误，年龄值需要在[1~150]之间";
		}else if(56 <= age){
			stage = "您处于老年阶段";
		}else if(36 <= age){
			stage = "您处于中年阶段";
		}else if(19 <= age){
			stage = "您处于青年阶段";
		}else if(11 <= age){
			stage = "您处于青少年阶段";
		}else if(6 <= age){
			stage = "您处于少年阶段";
		}

		System.out.println(stage);

	}
}