/*
	��������
		1. ���������η��б�����static�ؼ��֣������ĵ��÷�ʽ�ǣ�����.������(ʵ���б�);

		2. ���ǣ��е�ʱ�� ������.�������� ����ʡ�ԣ�ʲô����¿���ʡ���أ�
			-- ����ͬһ�����еķ���������.���Բ�д��ֱ���÷������Ϳ��Խ��е���
			-- �����������еķ����������Ҫ������.������ȥ����

		3. ������һ��javaԴ�ļ����У�ֻ����һ��class���Ƚ�����������ֻ��Ϊ�˽��ε�ʱ�򷽱㣬����һ��javaԴ�ļ����б�д�˶��class�����ַ�ʽ��Ҫģ��

*/

public class MethodTest06{

	public static void main(String[] args){
		
		// ���÷���
		MethodTest06.m();

		// ���ڷ��������η��б�����static�ؼ��ֵģ�������.�� ����ʡ�Բ�д��
		m();

		// ���������ࡾ���Ǳ��ࡿ�еķ���
		A.doOther();

		// ʡ�ԡ�����.������
		// ���뱨��������.��ʡ��֮��Ĭ�ϴӵ�ǰ�����ҡ�doOther���������ڵ�ǰ���и÷���������
		// doOther();
	}

	public static void m(){
		System.out.println("m method execute!");

		// �����ķ�ʽ
		MethodTest06.m2();

		// ʡ�Եķ�ʽ
		m2();

		// ������ñ��൱�е�m2���������ʱ���Ҫ�ӡ�����.����
		A.m2();
	}

	public static void m2(){
		System.out.println("m2 method execute!");
	}
}

class A{

	public static void doOther(){
		System.out.println("A's doOther method invoke!");
	}

	public static void m2(){
		System.out.println("A's m2 method execute!");
	}
}