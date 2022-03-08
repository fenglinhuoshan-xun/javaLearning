/*
	����Switch��䣺
		1. switch���Ҳ����ѡ��ṹ��Ҳ�Ƿ�֧���

		2. switch�����﷨�ṹ��
			һ���Ƚ�������switch���Ӧ��������д��
				switch(int���ͻ�String���͵�����ֵ�����){
					case int���ͻ�String���͵�����ֵ����� :
						java���;
						java���;
						...
						break;
					case int���ͻ�String���͵�����ֵ����� :
						java���;
						java���;
						...
						break;
					case int���ͻ�String���͵�����ֵ����� :
						java���;
						java���;
						...
						break;		
					...
					default :
						java���;
						...
				}

		3. switch���ִ��ԭ��
			switch����С���ŵ��е����ݣ���case��������ݣ�����һһƥ�䣬ƥ��ɹ��ķ�ִ֧��
			��ôƥ�䣿
				�������϶��µ�˳������ƥ��
				
		4. ƥ��ɹ������ִ֧�У���֧��������� break; ���Ļ�������switch�����ֹ

		5. ƥ��ɹ������ִ֧�У���֧����û�� break; ���Ļ���ֱ�ӽ�����һ����ִ֧�У�������ƥ�䣩���������󱻳�Ϊcase��͸�����ṩ break; �����Ա��⴩͸��

		6. ���еķ�֧��û��ƥ��ɹ�������default���ʱ����ִ��default��֧���еĳ���

		7. switch�����case���棬ֻ����int����String���͵����ݣ�������̽����������

			-- ��Ȼ��byte,short,charҲ����ֱ��д��switch��case���棬��Ϊ���ǿ��Խ����Զ�����ת����byte,short,char�����Զ�ת����int����

			-- JDK6�Ļ���switch��case���棬ֻ��̽��int����

			-- JDK7֮�󣬰���7�汾���ڣ����������ԣ�switch�ؼ��ֺ�case�ؼ��ֺ������̽��int��String���͵�����

		8. case���Ժϲ���
			int i = 10;
			switch(i){
				case 1: case 2: case 10:
					System.out.println("Test Code!");
			}
*/

public class SwitchTest01{

	public static void main(String[] args){

		/*
		long a = 10L;
		int b = a; // ���뱨��
		*/
	
		/*
		long x = 100L;
		switch(x){} // ���뱨��
		*/

		//����������
		long x = 100L;
		switch((int)x){}

		byte b = 10;
		switch(b){}

		short s = 10;
		switch(s){}

		char c = 'A';
		switch(c){}

		char cc = 97;
		switch(cc){}

		// ���뱨��
		// switch(true){}

		String username = "zhangsan";
		switch(username){}

		/*
			��������switch���
		*/
		// �����û�������
		// 1����ʾ����һ
		// 2����ʾ���ڶ�
		// ...
		// 7����ʾ������

		java.util.Scanner ss = new java.util.Scanner(System.in);
		System.out.print("���������֣�");
		int num = ss.nextInt();

		switch(num){
			case 1 :
				System.out.println("����һ");
				break;
			case 2 :
				System.out.println("���ڶ�");
				break;
			case 3 :
				System.out.println("������");
				break;
			case 4 :
				System.out.println("������");
				break;
			case 5 :
				System.out.println("������");
				break;
			case 6 :
				System.out.println("������");
				break;
			case 7 :
				System.out.println("������");
				break;
			default :
				System.out.println("�Բ�������������ַǷ�");
		}

		System.out.println("-----------------------------------------------");
		// case��͸
		// �����ӻ�һ������
		switch(num){
			case 1 :
				System.out.println("����һ");
			case 2 :
				System.out.println("���ڶ�");
			case 3 :
				System.out.println("������");
			case 4 :
				System.out.println("������");
			case 5 :
				System.out.println("������");
			case 6 :
				System.out.println("������");
			case 7 :
				System.out.println("������");
			default :
				System.out.println("�Բ�������������ַǷ�");
		}

		// case�ϲ�
		switch(num){
			case 1 : case 0 :
				System.out.println("����һ");
				break;
			case 2 :
				System.out.println("���ڶ�");
				break;
			case 3 :
				System.out.println("������");
				break;
			case 4 :
				System.out.println("������");
				break;
			case 5 :
				System.out.println("������");
				break;
			case 6 :
				System.out.println("������");
				break;
			case 7 :
				System.out.println("������");
				break;
			default :
				System.out.println("�Բ�������������ַǷ�");
		}
	}
}