/*
	for循环嵌套for循环
*/

public class ForTest06{

	public static void main(String[] args){
		
		for(int i=1; i<=10; i++){ // 共循环10次
			// 循环体中可以编写其他的控制语句
			// 控制语句可以嵌套使用
			// 控制语句可以是；if、if..else、switch、while、do..while

			// 编译报错，变量名冲突
			// 内层循环中的变量名和外层循环中的变量名不能重名
			/*
			for(int i=100;;){
				
			}
			*/

			System.out.println("i --> " + i);

			for(int j=0; j<3; j++){
				System.out.println("j --> " + j); // 10次0 1 2
			}
		}
	}
}