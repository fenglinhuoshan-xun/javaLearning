/*
	需求：
		判断当前的天气
			当外边下雨的时候：
				带雨伞：
					判断性别：
						当性别为男：带一把大黑伞
						当性别为女：带一把小花伞
			
			当外边是晴天的时候：
				判断天气的温度：
					当天气温度在30度以上：
						当性别为男：带墨镜
						当性别为女：擦防晒霜

		天气状况、温度、性别都需要从键盘输入
			天气状况：1表示下雨、0表示晴天
			温度直接使用数字即可
			性别：1表示男、0表示女

		注意：java中，字符串，不能用==进行比较

*/

public class IfTest03{
	
	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.println("欢迎使用本系统，您通过本系统可以完成一些简单的判断");
		System.out.println("说明1：1表示下雨，0表示晴天");
		System.out.println("说明2：1表示男，0表示女");
		System.out.println("说明3：温度为数字");

		System.out.print("请输入天气状况：");	
		int weatherConditions = s.nextInt();

		System.out.print("请输入性别：");
		int gender = s.nextInt();

		if(weatherConditions == 1){
			if(gender == 1){
				System.out.println("带一把大黑伞");
			}else if(gender == 0){
				System.out.println("带一把小花伞");
			}else{
				System.out.println("您输入的性别有误！");
			}			
		}else if(weatherConditions == 0){
			System.out.print("请输入温度：");
			int temperature = s.nextInt();
			if(temperature > 30){
				if(gender == 1){
					System.out.println("戴墨镜");
				}else if(gender == 0){
					System.out.println("擦防晒霜");
				}else{
					System.out.println("您输入的性别有误！");
				} 
			}
			
		}else{
			System.out.println("您输入的天气有误！");
		}

	}
}
