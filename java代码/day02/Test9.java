
// 编译通过了
// 能执行吗？
// 想从哪个入口进去执行，你就加载哪个类就行！！
/*
	java T1
	java T2
	java T3
*/

// 测试不代表以后就这样写，一般一个软件的执行只有一个，不会出现多个的

class T1{
	// 想从这个入口进去执行，怎么办？
	public static void main(String[] args){
		System.out.println("T1...");
	}
}

class T2{
	// 想从这个入口进去执行，怎么办？
	public static void main(String[] args){
		System.out.println("T2...");
	}
}

class T3 {
	// 想从这个入口进去执行，怎么办？
	public static void main(String[] args){
		System.out.println("T3...");
	}
}
