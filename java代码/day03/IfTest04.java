/*
	if语句
*/

public class IfTest04{

	public static void main(String[] args){
		
		boolean sex = true;

		if(sex){
			System.out.println("男");
		}else{
			System.out.println("女");
		}

		sex = false;
		if(sex) System.out.println("男"); else System.out.println("女");

		// ---------------------------------------------------------------

		if(sex)
			System.out.println("男"); // 是if成立时的一行代码
			System.out.println("呵呵"); // if的真假不影响这行程序的执行
		else // 程序中编译错误出现在25行，25行以上没有错误，错误提示：else缺少if。或者有if，没有else
			System.out.print("女");

	}
}