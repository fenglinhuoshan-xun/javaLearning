/*
	do..whileѭ����
		1. do..whileѭ�����﷨�ṹ��
			do{
				ѭ����
			}while(�������ʽ);

		2. do..whileѭ����ִ��ԭ��
			-- ��ִ��ѭ����
			-- �жϲ������ʽ�Ľ����
				true��
					ִ��ѭ����
					�жϲ������ʽ�Ľ����
						...
				false��
					����ѭ��

		3. do..whileѭ����ִ�д�����
			do..whileѭ����ѭ�������ִ�д����ǣ�1 ~ N�Ρ�����һ�Ρ�

		4. ʹ��do..whileѭ����ע�����
			do..whileѭ�����������һ���ֺţ�����
*/

public class DoWhileTest01{

	public static void main(String[] args){
		
		int i = 10;
		do{
			System.out.println(i);
		}while(i > 100);

		int k = 1;
		do{
			System.out.println(k); // 1 ~ 10
			k++;
		}while(k <= 10);
	}
}

/*
	for
	while
	do..while
*/