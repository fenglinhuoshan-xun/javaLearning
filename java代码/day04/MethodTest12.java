// 注意：在EditPlus中，字体颜色为红色的，表示一个类的名字，并且这个类是JavaSE类库中自带的
// 我们自定义的类MethodTest12，字体颜色是黑色的，是标识符
// 其实JavaSE类库中自带的类，如：String.class,System.class，这些类名也是标识符
// 只要是类名，就一定是标识符

// 重点：方法调用的时候，在参数传递的时候，实际上传递的是变量中保存的那个值，把值传过去了
public class MethodTest12{

	public static void main(String[] args){
		
		int a = 10;
		int b = 20;

		int retValue = sumInt(a,b);

		System.out.println("retValue = " + retValue);
	}

	public static int sumInt(int i,int j){

		int result = i + j; // cpu负责计算
		int num = 3;
		int retValue = divide(result,3);
		return retValue;
	}

	public static int divide(int x,int y){

		int z = x/y;
		return z; // 10
	}
}

/*
	画图依据：
		1. 只要涉及到参数传递的问题，传递的是变量中保存的值
		2. 画图的时候，必须遵循“代码自上而下”的顺序依次执行
*/