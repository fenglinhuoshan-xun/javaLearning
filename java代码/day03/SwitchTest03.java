public class SwitchTest03{

	public static void main(String[] args){
		
		// char c = 'A';
		// char c = 65;
		 char c = 'B';
		// char c = 'D';

		switch(c){
			case 'A' : // switch和case后面，只能跟int类型和String类型的数据，char类型也能写，自动类型转换
				System.out.println("高级");
				break;
			case 'B' :
				System.out.println("中级");
				break;
			case 'C' :
				System.out.println("初级");
				break;
			default :
				System.out.println("出错了！");
		}

		switch(c){
			case 'A' :
				System.out.println("高级");
				break;
			case 66 :
				System.out.println("中级");
				break;
			case 'C' :
				System.out.println("初级");
				break;
			default :
				System.out.println("出错了！");
		}
	}
}