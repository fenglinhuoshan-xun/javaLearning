/*
	��ǰһ������Ļ���֮�ϣ�����1~100���������ĺ�
		1 + 3 + 5 + 7 + ... + 99 �ۼ�
*/

public class ForTest05{

	public static void main(String[] args){

		int sum = 0;
		for(int i=1; i<=100; i+=2){
			// iһ��������
			sum += i;

		}

		System.out.println(sum);
	
		// ---------------------------------------

		// ����
		sum = 0;
		for(int i=1; i<=100; i++){
			if(i % 2 == 1){
				sum += i;
			}
		}

		System.out.println(sum);
	}
}