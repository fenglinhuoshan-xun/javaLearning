// 默认继承Object，Object类中有哪些方法呢？
/*
	package java.lang;

	import jdk.internal.vm.annotation.IntrinsicCandidate;

	public class Object {

		@IntrinsicCandidate
		public Object() {}

		@IntrinsicCandidate
		public final native Class<?> getClass(); // 注意：当源码当中一个方法以“;”结尾，并且修饰符列表中有“native”关键字的时候，表示底层调用C++写的dll程序（dll动态链接库文件）

		@IntrinsicCandidate // 注解
		public native int hashCode();  // 底层也是调用C++

		// equals方法你应该能看懂
		// public是公开的
		// boolean是布尔类型
		// equals是一个方法名，表示相等的意思
		// (Object obj) 形参
		// 只不过目前还不知道这个方法存在的意义
		public boolean equals(Object obj) {
			// 方法体
			return (this == obj);
		}

		// 已有对象a，想创建一个和a一模一样的对象，你可以调用这个克隆方法
		// 底层也是调用C++
		@IntrinsicCandidate
		protected native Object clone() throws CloneNotSupportedException;

		// 一会我们可以测试一下toString方法
		// public表示公共的
		// String是返回值类型，toString()方法执行结束之后返回一个字符串
		// toString是方法名
		// {}表示形参个数为0
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}

		@IntrinsicCandidate
		public final native void notify();

		@IntrinsicCandidate
		public final native void notifyAll();

		public final void wait() throws InterruptedException {
			wait(0L);
		}

		public final native void wait(long timeoutMillis) throws InterruptedException;

		public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
			if (timeoutMillis < 0) {
				throw new IllegalArgumentException("timeoutMillis value is negative");
			}

			if (nanos < 0 || nanos > 999999) {
				throw new IllegalArgumentException(
									"nanosecond timeout value out of range");
			}

			if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
				timeoutMillis++;
			}

			wait(timeoutMillis);
		}

		@Deprecated(since="9")
		protected void finalize() throws Throwable { }
	}

*/

public class toStringTest01{

	// toStringTest01默认继承Object
	// toStringTest01当中是有toString()方法
	// 不过toString()方法是一个实例方法，需要创建对象才能调用

	public static void main(String[] args){

		// 分析这个代码可以执行吗？
		// 编译报错
		// toStringTest01.toString();
		/*
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}	
		*/

		// 先new对象
		toStringTest01 tst = new toStringTest01();
		String retValue = tst.toString();

		// 15db9742 可以“等同”看做对象在堆内存当中的内存地址
		// 实际上是内存地址经过“哈希算法”得出的十六进制的结果
		System.out.println(retValue); // toStringTest01@15db9742

		// 创建对象
		Product pro = new Product();
		String retValue2 = pro.toString();
		System.out.println(retValue2); // Product@6d06d69c

		// 以上两行代码合并为一行，可以！
		// 因为对象只new了一次，所以结果一样
		System.out.println(pro.toString()); // Product@6d06d69c

		// 如果直接输出“引用”呢？
		// println方法会自动调用pro的toString()方法
		System.out.println(pro); // Product@6d06d69c

	}
}

class Product{

}




