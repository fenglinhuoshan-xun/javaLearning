/*
	�ڷ���ֵ������void�ķ�������ʹ�� ��return;�� ���
	��return;�� �������ڷ���ֵΪvoid�ķ������У���Ҫ��Ϊ����ֹ��ǰ������ִ��
*/

public class MethodTest10{

	public static void main(String[] args){

		m();
		
		for(int i=10; i>0; i--){
			if(i == 2){
				return; // ��������main����
			}
			System.out.println("data --> " + i);
		}

		System.out.println("Execute Here!");
		
		// ������󣺷���ֵ������void�����ܷ���ֵ
		// return 100; 
	}

	// ������󣺶��ڽ������Ϊ�յķ������޷�����ֵ
	/*
	public static void m(){
		
		return 10;
	}
	*/

	// ����
	/*
	public static void m(){	
		return;
	}
	*/

	public static void m(){
		for(int i=0; i<10; i++){
			if(i == 5){
				// return; // ������ֹ��forѭ������ֹ����m()����
				break; // ��ֹ����forѭ��
			}
			System.out.println("i --> " + i);
		}

		System.out.println("Hello World!");
	}
}