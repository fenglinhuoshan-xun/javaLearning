/*
	��������Ϸ��һ����A��һ��ʵ������v���Ӽ��̽���һ����������Ϊʵ�������ĳ�ʼֵ�������ٶ���һ����B����A��ʵ������v���в²⣺
		������ˣ�����ʾ����
		���С�ˣ�����ʾС��
		���ڣ�����ʾ�²�ɹ�
*/
public class Test01{

	public static void main(String[] args){
		
		// ����A����
		java.util.Scanner s1 = new java.util.Scanner(System.in);
		System.out.print("�����뱻�²�����֣�");
		int shiJiZhi = s1.nextInt();

		A a = new A(shiJiZhi);
		// ����B����
		B b = new B(a);
		// ��ʼ�²�
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		while(true){
			System.out.println("���������²�����֣�");
			int caiCeNum = s2.nextInt();
			b.cai(caiCeNum);
		}
		
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

	public void setV(int v){
		this.v = v;
	}


}

class B{

	// ͨ��B�²�A
	// ��B��������һ��A���������
	// ��A��ΪB��ʵ������
	// ͨ����ѧ�߻Ῠ�������֪��Ӧ������д����֪����A����ΪB��һ������
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

	// �²�ķ���
	public void cai(int caiCeNum){
		// ʵ������
		// int shiJiZhi = this.getA().getV();
		int shiJiZhi = a.getV();
		if(caiCeNum == shiJiZhi){
			System.out.println("�²�ɹ�");
			// ��ֹ�����ִ��
			// �˳�JVM
			// System��������exit�Ǿ�̬������0�ǲ���
			System.exit(0); // ��ǰû��д�����˳�JVM
		}else if(shiJiZhi > caiCeNum){
			System.out.println("��С��");
		}else{
			System.out.println("�´���");
		}
	}

}