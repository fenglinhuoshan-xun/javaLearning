/*
	System.out.println(); // ���������̨��������ڴ浽����̨��������Ĺ��̣����Ǵ��ڴ��г����ˡ�

	�����û��������롾�Ӽ��̵��ڴ桿������Ĺ��̣����ڴ���ȥ��

	���´����Ȳ�Ҫ��Ϊʲô���̶���д�Ϳ��Խ����û�����������

*/

public class KeyInputTest{

	public static void main(String[] args){
		
		//��һ������������ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// �ڶ���������Scanner�����next()��������ʼ�����û���������
		// ����ִ�е������ͣ�������ȴ��û�������
		// ���û������ʱ�򣬲��������ûس�����ʱ���������Ϣ���Զ���ֵ��userInputContent����
		// ����ִ�е�����û��������Ϣ���Ѿ����ڴ�����
		// �����ı������ַ�������ʽ����
		// String userInputContent = s.next(); // ��ʶ���������淶������֪��

		// ���ڴ��е��������������̨
		// System.out.println("�������ˣ�" + userInputContent);

		// �������֣���������int����ʽ������
		// ����ı��������֣�������������ͻᱨ��
		int num  = s.nextInt();

		System.out.println("������������ǣ�" + num);
		System.out.println("��������" + (num + 100));
		
	}
}