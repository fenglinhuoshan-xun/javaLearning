/*
	����java���Ե��е�char���ͣ�
		ת���ַ� \ 
		ת�壺����ȥ�����⻯����������ͨ�ַ�
		ת���ַ������������ַ�֮ǰ���Ὣ�����ַ�ת������ͨ�ַ�

		\n	���з�
		\t	�Ʊ��
		\'	��ͨ�ĵ�����
		\\	��ͨ�ķ�б��
		\"	��ͨ��˫����
*/
public class DataTypeTest03{

	public static void main(String[] args){
		
		// ��ͨ��n�ַ�
		char c1 = 'n';
		System.out.println(c1);

		// ����һ�����з�������char���͵�����
		// ��б����java���Ե��о���ת�幦��
		char c2 = '\n';


		// System.out.print()��System.out.println()������
		// println���֮���У�print���֮�󣬲�����
		// System.out.print("Hello");
		// System.out.println("World!");

		System.out.print("A");
		System.out.println(c2);
		System.out.println("B");

		// �Ʊ��tab��
		// ǿ�����Ʊ���Ϳո�ͬ�����ǵ�ASCII�벻ͬ�������ڼ�����������ͬ�İ���
		char y = '\t';
		System.out.print("A");
		System.out.print(y);
		System.out.println("B");

		// Ҫ���ڿ���̨�������б���ַ�
		// ��б�ܽ�����ĵ�����ת���һ����ͨ�Ĳ��߱��κκ���ĵ������ַ�����ʱ��ߵĵ�������������һ�룬ȱ���˽����ĵ������ַ������뱨��
		/*
		char k = '\';
		System.out.println(k);
		*/

		/*
			\\��
			���ͣ���һ����б�ܾ���ת�幦�ܣ�������ķ�б��ת��Ϊ��ͨ�ķ�б���ַ�
			���ۣ���java�У�������б�ܱ�ʾһ����ͨ�ķ�б���ַ�
		*/
		char k = '\\';
		System.out.println(k);

		// �ڿ���̨�����������
		// char a = ''; // ���뱨�����ַ����֡�java�в���������д
		
		// char a = '''; //����

		// ��б�ܾ���ת�幦�ܣ����ڶ���������ת�����ͨ�ĵ������ַ�����һ�������ź����һ�����������
		char a = '\'';
		System.out.println(a);

		System.out.println("Hello World!");
		System.out.println("��Hello World!��");
		System.out.println("\"Hello World!\"");

		char m = '��';
		System.out.println(m);

		// JDK���Դ���native2ascii.exe������Խ�����ת����Unicode������ʽ������JDK9�汾�󣬾�û�����������
		// ��ôʹ��������
		// ������������native2ascii���س���Ȼ����������֮�󣬻س����ɵõ�Unicode����
		char n = '\u4e2d'; // '��'��Ӧ��Unicode������4e2d
		System.out.println(n);

		// char g = '4eud'; // �������
		// char g = 'u4e2d'; // �������
		// ͨ������б�ܺ�u������������ʾ�����һ�����֣���ĳ�����ֵ�Unicode����
		char g = '\u4e2d';
		System.out.println(g);

		// g = '\u456a';
		// g = '\u256a';
		g = '\u456b';
		System.out.println(g);

		// char���͵�Ĭ��ֵ
		char c = '\u0000';
		System.out.println(c); // �հף�ʲô��û��

	}
}

/*
	ʮ���ƣ�1 2 3 4 5 6 7 8 9 10 11 12 13 ...
	�����ƣ�0 1 10 11 100 101 ...
	ʮ�����ƣ�0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20 ... ��ʮ����1
	�˽��ƣ�0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20 ...
*/