// 测试类
public class OOTest02{

	public static void main(String[] args){
		
		// 创建User对象
		// u是局部变量
		// u是一个引用
		// u保存内存地址，指向堆内存的User对象
		User u = new User();

		// 输出User对象内部实例变量的值
		System.out.println(u.no); // 0
		System.out.println(u.name); // null
		System.out.println(u.addr); // null

		// 修改User对象内部实例变量的值
		u.no = 110;
		// 字符串比较特殊，不用new，也会创建出来一个相关的对象
		// 字符串每次赋值的时候，先创建一个字符串对象，对象里面存储了值
		// name中存储的是字符串对象
		u.name = "jack"; // "jack"是一个java对象，属于String对象
		u.addr = new Address();

		// 在main方法当中，目前只能看到一个引用u
		// 一切都是只能通过u来进行访问
		System.out.println(u.name + "居住在哪个城市：" + u.addr.city);
		System.out.println(u.name + "居住在哪个街道：" + u.addr.street);
		System.out.println(u.name + "邮编：" + u.addr.zipcode);
		
		u.addr.city = "北京";
		u.addr.street = "朝阳";
		u.addr.zipcode = "11111111";

		System.out.println(u.name + "居住在哪个城市：" + u.addr.city);
		System.out.println(u.name + "居住在哪个街道：" + u.addr.street);
		System.out.println(u.name + "邮编：" + u.addr.zipcode);
	}
}

/*
	引用可以是局部变量，也可以是成员变量/实例变量
*/