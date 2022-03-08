/*
	猜数字游戏：一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量的初始值，另外再定义一个类B，对A的实例变量v进行猜测：
		如果大了，则提示大了
		如果小了，则提示小了
		等于，则提示猜测成功
*/
public class Test01{

	public static void main(String[] args){
		
		// 创建A对象
		java.util.Scanner s1 = new java.util.Scanner(Sytem.in);
		Systm.out.print("请输入被猜测的数字：");
		shiJiZhi = s1.nexInt();

		A a = new A(shiJiZhi);
		// 创建B对象
		B b = new B(a);
		// 开始猜测
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		System.out.println("请输入您猜测的数字：");
		int caiCeNum = s.nexInt();
		b.cai(caiCeNum);
		
	}
}

class A{
	private int v;
	public A(){
		
	}

	public A(int v){
		this.v = v;
	}

	public int getV(){
		return v;
	}

	public setV(int v){
		this.v = v;
	}


}

class B{

	// 通过B猜测A
	// 在B对象中有一个A对象的引用
	// 把A作为B的实例变量
	private A a;

	public B(){
		
	}

	public B(A a){
		this.a = a;
	}

	public void setA(A a){
		this.a = a;
	}

	public A getA(){
		return a;
	}

	// 猜测的方法
	public void cai(int caiCeNum){
		// 实际数字
		// int shiJiZhi = this.getA().getV();
		int shiJiZhi = a.getV();
		if(caiCeNum == shiJiZhi){
			System.out.println("猜测成功");
		}else if(shiJiZhi > caiCeNum){
			System.out.println("猜小了");
		}else{
			System.out.println("猜大了");
		}
	}

}