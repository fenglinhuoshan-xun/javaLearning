/*
	关于布尔型数据类型：
		boolean
	
	在java语言当中，boolean类型只要两个值，true,flase，没有其他值
	不想C语言当中，0和1可以表示假和真

	在底层存储的时候，boolean类型占用1个字节，因为实际存储的时候，false底层是0，true底层是1

	布尔类型在实际开发当中非常重要，经常使用在逻辑运算和条件控制语句当中

*/

public class DataTypeTest07{

	public static void main(String[] args){
		
		// 编译错误：不兼容的类型
		// boolean flag = 1;

		// boolean loginSuccess = true;
		boolean loginSuccess = false;

		// if语句以后讲【条件控制语句】
		if(loginSuccess){
			System.out.println("恭喜你，登录成功");
		}else{
			System.out.println("对不起，用户名不存在或者密码错误！");
		}

	}
}