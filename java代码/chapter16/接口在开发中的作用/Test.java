public class Test{
	public static void main(String[] args){
		// 创建厨师对象
		// cooker1是菜单1的意思
		// FoodMenu cooker1 = new ChinaCooker();
		FoodMenu cooker1 = new AmericCooker();

		// 创建顾客对象
		Customer customer = new Customer(cooker1);

		// 顾客点菜
		// customer.order(); // 不传菜单参数，运行时就会出现空指针异常。空指针异常：空引用访问实例对象的数据
		customer.order(); 
	}
}