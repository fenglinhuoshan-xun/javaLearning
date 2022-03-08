/*
	关于Object类中的toString()方法
		1. toString()方法的作用是什么？
			作用：将“java对象”转换成“字符串的形式”

		2. Object类中toString()方法的默认实现是什么？
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}	
		toString()：方法名的意思就是转换成String
		含义：调用一个java对象的toString()方法，就可以将该java对象转换成字符串的表示形式

		3. 那么toString()方法给的默认实现够用吗？
			不够用的话，可以自己重写/覆盖
*/

public class toStringTest02{

	public static void main(String[] args){

		// 创建一个日期对象
		MyDate t1 = new MyDate();
		// 调用toString()方法（将对象转换成字符串形式）
		// 问：你对这个输出结果满意吗？不满意，希望输出：xxx年xx月xx日
		// 重写toString()方法之前的结果
		// System.out.println(t1.toString()); // MyDate@15db9742

		// 重写toString()方法之后的结果
		System.out.println(t1.toString()); // 2022年2月13日
		System.out.println(t1); // 2022年2月13日		
		
		// 你输出一个对象的时候，可能更愿意看到一个对象的具体信息，而不是内存地址，所以要重写
		MyDate t2 = new MyDate(2008,8,8);
		System.out.println(t2); // 2008年8月8日
	}
}

// 日期类
class MyDate{
	private int year;
	private int month;
	private int day;
	public MyDate(){
		this(2022,2,13);
	};

	public MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getMonth(){
		return month;
	}

	public void setDay(int day){
		this.day = day;
	}

	public int getDay(){
		return day;
	}

	// 从Object类中继承过来的那个toString方法已经无法满足我业务需求了
	// 我在子类MyDate中有必要对父类的toString()方法进行覆盖/重写
	// 我的业务需求是调用toString()方法进行字符串转换的时候，希望转换的结果是：xxx年xx月xx日
	// 重写一定要复制粘贴，不要手动编写，会错的
	public String toString() {
		return year + "年" + month + "月" + day + "日";
	}	

}
// 方法覆盖是为了多态，多态机制：会使得程序具有很强的扩展性