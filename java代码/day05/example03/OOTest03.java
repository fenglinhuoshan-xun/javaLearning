public class OOTest03{

	public static void main(String[] args){
		
		// u是引用
		// u是局部变量
		User u = new User();

		// 上一个版本中编写的
		// u.addr = new Address();

		// a是局部变量
		// a是引用
		Address a = new Address();
		u.addr = a;

		System.out.println(u.addr.city); // null

		a.city = "天津";
		System.out.println(u.addr.city); // 天津

	}
}