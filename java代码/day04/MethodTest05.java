/*
	�������õ�ʱ��ʵ�κ��β�Ҫ�������Ӧ��ͬ���������Ͷ�Ӧ��ͬ
	���Ͳ�ͬ��ʱ��Ҫ���ܹ�������Ӧ���Զ�����ת��
*/

public class MethodTest05{

	public static void main(String[] args){
		
		// ������󣺲���������ͬ
		// MethodTest05.sum();

		// �������ʵ�κ��βε����Ͳ��Ƕ�Ӧ��ͬ��
		// MethodTest05.sum(true,false);

		// ����
		// MethodTest05.sum(10L, 20L);

		// ���ԣ������Զ�����ת��
		MethodTest05.sum(10, 20);

		// ������󣺲������Ͳ��Ƕ�Ӧ��ͬ��
		// MethodTest05.sum(2.0,20);

		// ����
		MethodTest05.sum((long)2.0,20);
	}

	public static void sum(long a, long b){
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}