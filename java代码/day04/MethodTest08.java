/*
	�����ķ���ֵ���Ͳ���void��ʱ��
		1. ����ֵ����void��ʱ��
			-- Ҫ�󷽷����뱣֤�ٷ�֮�ٵ�ִ�� ��return ֵ;�� ��������������ֵ�ķ���
			-- û���������ʱ�򣬱������ᱨ��

		2. һ�������з���ֵ��ʱ�򣬵����ǵ������������ʱ�򣬷���������һ��ֵ���Ե�������˵���������ֵ����ѡ����գ�Ҳ����ѡ�񲻽��գ����Ǵ󲿷�����£����Ƕ���ѡ����յ�
*/

public class MethodTest08{

	public static void main(String[] args){

		coculate(10,3); // ����û�н�����������ķ�������

		// ���շ���ִ�н���֮��ķ���ֵ
		// ���ñ�������
		// ����������������Ҫ�ͷ���ֵ������������ͬ�����߿����Զ�����ת��
		int i = coculate(10,3); // ����
		System.out.println(i);

		long x = coculate(10,3); // ����
		System.out.println(x);

		System.out.println(coculate(10,3)); // ����


	}

	/*
		�����붨�岢ʵ��һ���������÷������Լ�������int�������ݵ��̣�Ҫ�����յļ��������ظ�������
	*/

	/*
	// ���뱨��ȱ�ٷ������
	public static int coculate(int a, int b){

	}
	*/

	/*
	// �������ȱ�ٷ���ֵ
	public static int coculate(int a, int b){
		return;
	}
	*/

	/*
	// ������󣺷��������ʱ��Ҫ�󷵻�һ��int���ͣ���ʱ���ز������ͣ����Ͳ�����
	public static int coculate(int a, int b){
		return true;
	}
	*/

	public static int coculate(int a, int b){
		return a/b;
	}
}