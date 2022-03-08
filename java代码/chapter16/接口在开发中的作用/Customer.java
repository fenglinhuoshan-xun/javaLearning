// 顾客
public class Customer{
	// 顾客手里有一个菜单
	// Customer has a FoodMenu（这句话什么意思：顾客有一个菜单）
	// 记住：以后凡是能够使用 has a 描述的，统一以属性的方式存在
	// 声明一个实例变量/属性
	// 面向抽象编程，面向接口编程，降低程度的耦合度，提高程序的扩展力
	// FoodMenu是引用数据类型，foodMenu是引用
	private FoodMenu foodMenu; // 都要养成封装的好习惯
	
	// 如果以下这样写，就表示写死了（焊接了。没有可插拔了）
	/*
	中餐厨师
	ChinaCooker cc;

	西餐厨师
	AmericCoker ac; 
	*/

	// 构造方法
	public Customer(){
		
	}

	public Customer(FoodMenu foodMenu){
		this.foodMenu = foodMenu;
	}

	public FoodMenu getFoodMenu(){
		return foodMenu;
	}

	public void setFoodMenu(FoodMenu foodMenu){
		this.foodMenu = foodMenu;
	}

	// 提供一个点菜的方法
	public void order(){
		// 先拿到菜单才能点菜
		// 调用get方法拿到菜单
		FoodMenu fm = this.getFoodMenu();
		// 也可以不调用get方法，因为在本类中私有的属性是可以访问的
		foodMenu.shiZiChaoJiDan();
		foodMenu.yuXiangRouSi(); // this.可以不写
	}

}

/*
	Cat is a Animal，但凡满足 is a 的表示，都可以设置为继承
	Customer has a FoodMenu，但凡是满足 has a 的表示都以属性的形式存在
*/
