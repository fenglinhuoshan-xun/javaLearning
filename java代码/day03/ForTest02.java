/*
	
*/

public class ForTest02{

	public static void main(String[] args){
		
		// ���µ�forѭ�����е�i�������������ǽ����ڵ�ǰforѭ���ڲ�ʹ��
		for(int i=0; i<10; i+=1){
			System.out.println("i --> " + i);
		}

		// ���µ�forѭ�����е�i�������������ǽ����ڵ�ǰforѭ���ڲ�ʹ��
		for(int i=0; i<=10; i++){
			System.out.println("i -->" + i);
		}

		// ���i����������main�������������з������޷�����
		// System.out.println("i = " + i); // ��������Ҳ�������

		// main�����������е�i������ֻҪmain����û�н����������i������
		int i = 0;
		for(; i<10; i++){
			System.out.println("i = " + i); 
		}

		// ������Է���main�����������е�i����
		System.out.println("i ======> " + i); // 10

		int j;
		for(j = 1; j < 10; j++){
			System.out.println("j --> " + j);
		}

		System.out.println(j); // 10
	}
}