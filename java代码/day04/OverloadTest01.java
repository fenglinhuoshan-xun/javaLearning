/*
	���·�����ʹ�á��������ػ��ơ�����ʹ��overload�����������ȱ�㣿
		1. sumInt��sumLong��sumDouble������Ȼ���ܲ�ͬ�����ǹ��������Ƶģ�������ͣ������´��뵱�й������Ƶķ������ֱ�����������ͬ�����֣�����ڳ���Ա��˵�����÷�����ʱ�򲻷��㣬����Ա��Ҫ�������ķ��������ܹ���ɵ��á������㡿

		2. ���벻����

	��û������һ�ֻ��ƣ�
		������Ȼ��ͬ�����ǹ������Ƶ�ʱ����û��������һ�ֻ��ƣ������ó���Աʹ����Щ������ʱ�򣬾�����ʹ��ͬһ������һ������������Ա�Ժ��д�����ʱ��ȽϷ��㣬Ҳ����Ҫ�������ķ�����������Ҳ�������

		�����ֻ��ƣ��������ػ���/Overload
*/

public class OverloadTest01{

	public static void main(String[] args){

		// ���÷���
		int result1 = sumInt(1,2);
		System.out.println(result1);

		double result2 = sumDouble(1.0,2.0);
		System.out.println(result2);

		long result3 = sumLong(1L,2L);
		System.out.println(result3);
		
	}

	// ����һ�����������Լ�������int�������ݵĺ�
	public static int sumInt(int a, int b){
		return a + b;
	}

	// ����һ�����������Լ�������double�������ݵĺ�
	public static double sumDouble(double a, double b){
		return a + b;
	}

	// ����һ�����������Լ�������long�������ݵĺ�
	public static long sumLong(long a, long b){
		return a + b;
	}

	// ����ϣ���ﵽ��Ч���ǣ�����Ա��ʹ��������������Ƶķ�����ʱ�򣬾�����ʹ��һ������һ��
	// Java֧�����ֻ��ơ��е����Բ�֧�֣����Ժ�Ҫѧϰ�ģ�JavaScript��
}