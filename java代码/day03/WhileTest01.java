/*
	whileѭ����䣺
		1. whileѭ�����﷨�ṹ��
			while(�������ʽ){
				ѭ����;
			}

		2. whileѭ����ִ��ԭ��
			-- ���жϲ������ʽ�Ľ����
				* true
					ִ��ѭ����
					�жϲ������ʽ�Ľ����
						* true��
							ִ��ѭ����
							�жϲ������ʽ�Ľ��
							...

						* false
				* false
					ѭ������

		3. whileѭ����ѭ��������
			0 ~ N��
			ע�⣺whileѭ����ѭ�������ִ�д���Ϊ0��
*/

public class WhileTest01{

	public static void main(String[] args){
		
		// ��ѭ��
		/*
		while(true){
			System.out.println("��ѭ��");
		}
		*/

		// ��������⵽�ó�����Զ���޷���ִ�У����Ա��뱨��
		// System.out.println("Hello World!");

		int i = 10;
		int j = 3;
		/*
		// ���Ա���ͨ��
		while(i>j){ // ������ֻ����﷨������������
			System.out.println("�Ǻ�");
		}
		*/

		// JDK8���벻ͨ�����°汾JDK����ͨ��
		while(10 > 3){
			System.out.println("�Ǻ�");
		}
	}
}
