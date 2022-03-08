/*
	通过这个测试得出的结论：
		-- super不是引用，super也不保存内存地址，super也不指向任何对象
		-- super只是代表代表当前对象内部的那一块父类型的特征
*/

public class SuperTest06{

	// 实例方法
	public void doSome(){
		// System.out.println(this);
		// 输出“引用”的时候，会自动调用引用的toString方法
		System.out.println(this.toString()); // SuperTest06@15db9742

		// 编译错误：需要'.'
		// System.out.println(super);  // 编译报错
	}


	// this和super不能使用在static静态方法当中
	/*
	public static void doOther(){
		System.out.println(this);
		System.out.println(super.xxx);
	}
	*/

	public static void main(String[] args){
		SuperTest06 st = new SuperTest06();
		st.doSome();
	}
}
