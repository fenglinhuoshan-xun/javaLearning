/*
	��ϵ�������
		>			����
		>=			���ڵ���
		<			С��
		<=			С�ڵ���
		==			����
		!=			������

	ע�⣺
		= �Ǹ�ֵ�����
		== �ǹ�ϵ�����
		��ϵ�������������һ���ǲ������ͣ�true/false

	��ϵ�����������ԭ���Ƚϵ��Ǳ��������ֵ֮��Ĺ�ϵ�Ƚ�
	������Ͷ��ˣ���������ɲ�һ���洢����һ��ֵ����һ����һ�������������͵�����ֵ���п�����һ��java������ڴ��ַ
*/

public class OperatorTest02{

	public static void main(String[] args){
		
		int a = 10;
		int b = 10;

		System.out.println(a > b); // false
		System.out.println(a >= b); // true
		System.out.println(a < b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // true
		System.out.println(a != b); // false
	}
}