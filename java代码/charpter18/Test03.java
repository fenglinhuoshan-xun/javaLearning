/*
	java�����е��ַ���String����û����дtoString��������û����дequals����

	�ܽ᣺
		1. String���Ѿ���д��equals�������Ƚ������ַ�������ʹ��==������ʹ��equals��equals��ͨ�õ�
		2. String���Ѿ���д��toString����

	����ۣ�	
		1. java��ʲô���͵����ݿ���ʹ�á�==���ж�
			java�л����������ͱȽ��Ƿ���ȣ�ʹ��==
		2. java��ʲô���͵�������Ҫʹ��equals�ж�
			java�����е�������������ͳһʹ��equals�������ж��Ƿ����
		
		���ǹ��
*/
public class Test03{
	public static void main(String[] args){
		// �󲿷�����£����������ķ�ʽ�����ַ�������
		String s = "abc";
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1 == s2); // true

		// ʵ����StringҲ��һ���࣬�����ڻ�����������
		// ��ȻString��һ���࣬��ôһ�����ڹ��췽��
		String s3 = new String("Test1");
		String s4 = new String("Test1");
		// new���Σ����������ڴ��ַ��s3������ڴ��ַ��s4������ڴ��ַ��ͬ
		// == �жϵ����ڴ��ַ����������
		System.out.println(s3 == s4); // false

		// �Ƚ������ַ����ܲ���ʹ��˫�Ⱥţ�
		// ���ܣ�����ʹ��equals����
		// String���Ѿ���дequals������
		System.out.println(s3.equals(s4)); // true

		// String����û����дtoString�����أ�
		String x = new String("�����ڵ�");
		// ���String��û����дtoString������������Ӧ���ǣ�java.lang.String@ʮ�����Ƶĵ�ַ
		// �������ԣ�String���Ѿ���д��toString()����
		System.out.println(x.toString()); // �����ڵ�
		System.out.println(x); // �����ڵ�

	}
}