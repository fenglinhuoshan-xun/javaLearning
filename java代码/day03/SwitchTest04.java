/*
	ʵ�ּ��������е�
		+
		-
		*
		/
		%
	ʵ��˼·��
		1. ѡ���������ݴӼ�������
		2. ʹ��switch�������ж�
		3. ��Ҫ�ӿ���̨��������
			* ��һ������
			* �����
			* �ڶ�������
	�����ڿ���̨����������һ��������
		��ӭʹ�ü򵥼�����ϵͳ��
			�������һ�����֣�10
			�������������+��-��*��/��%
			������ڶ������֣�20
			��������10 + 20 = 30
*/

public class SwitchTest04{

	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥼�����ϵͳ");
		System.out.print("�������һ�����֣�");
		int num1 = s.nextInt();
		System.out.print("�������������");
		String operator = s.next();
		System.out.print("������ڶ������֣�");
		int num2 = s.nextInt();

		int result = 0;
		switch(operator){
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
			default :
				System.out.println("���������������Ϸ�");
		}

		System.out.println("��������" + num1 + " " + operator + " " + num2 + " = " + result);
	}
}






