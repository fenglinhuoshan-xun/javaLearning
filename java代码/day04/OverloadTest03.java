/*
	�������أ�
		1. ���������ֱ���Ϊ��Overload

		2. ʲôʱ���Ƿ������أ�
			--  �������Ƶ�ʱ�򣬾������÷�������ͬ�����ǣ����ܲ�ͬ/�����Ƶ�ʱ�򣬾������÷�������ͬ

		3. ʲô��������֮�󣬹����˷������أ�
			-- ��ͬһ���൱��
			-- ��������ͬ
			-- �����б�ͬ
				* ������ͬ
				* ˳��ͬ
				* ���Ͳ�ͬ

		4. �������غ�ʲô�й�ϵ����ʲôû�й�ϵ��
			-- �������غͷ������������б��й�ϵ��������ֻ��ͨ���������Ͳ����б���ʶ�����ͬ�ķ���
			-- �������غͷ���ֵ�����޹أ�������������ͨ������ֵ��ʶ��������Ĳ�ͬ
			-- �������غ����η��б��޹�
			
*/

public class OverloadTest03{

	public static void main(String[] args){
		m1();
		m1(10);

		m2(1,2.0);
		m2(2.0,1);

		m3(10);
		m3(3.0);

		// m4(1,2);
		// m4(2,1);
	}

	// ��������������������
	public static void m1(){}
	public static void m1(int a){}

	// ��������������������
	public static void m2(int a, double b){}
	public static void m2(double a, int b){}

	// ��������������������
	public static void m3(int x){}
	public static void m3(double y){}

	// ��������������ж����˷���
	// ���²��Ƿ������أ��Ƿ����˷����ظ���
	/*
	public static void m4(int a, int b){}
	public static void m4(int b, int a){}
	*/

	// ���뱨���������ж����˷���
	/*
	public static void x(){
		
	}

	public static int x(){
		return 1;
	}
	*/

	// ���뱨���������ж����˷���
	/*
	void y(){
		
	}

	public static void y(){
		
	}
	*/
}