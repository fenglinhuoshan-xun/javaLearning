/*
	��Ԫ�����/��Ŀ�����/���������
		1. �﷨����
			�������ʽ ? ���ʽ1 : ���ʽ2

		2. ��Ԫ�������ִ��ԭ��
			���������ʽ�Ľ����true��ʱ��ѡ����ʽ1��Ϊ�������ʽ��ִ�н��
			���������ʽ�Ľ����false��ʱ��ѡ����ʽ2��Ϊ�������ʽ��ִ�н��
*/

public class OperatorTest06{

	public static void main(String[] args){
		
		// ���뱨������һ��������java���
		// 10;

		// ���뱨������һ��������java���
		// '��';

		// �������͵ı���
		boolean sex = false;

		//�������³����Ƿ���Ա���ͨ����
		// ���뱨����Ϊ������һ��������java���
		// sex ? '��' : 'Ů';

		char c = sex ? '��' : 'Ů';
		// ���Ա���ͨ��
		System.out.println(c); // Ů

		// �������String��Ҳ����char������ǰ�߲�����char����������
		// ���뱨�������ݵ�����
		// char c1 = sex ? "��" : 'Ů';

		System.out.println(10);
		System.out.println("10");
		System.out.println('1');

		// ����
		System.out.println(sex ? '��' : 'Ů');

		String s = sex ? "�е�" : "Ů��";
		System.out.println(s);

	}
}

