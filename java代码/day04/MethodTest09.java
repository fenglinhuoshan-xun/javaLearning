/*
	����return���
		1. ����return�ؼ��ֵ�java���ֻҪִ�У����ڵķ���ִ�н���

		2. ��ͬһ���������У�return������治�ܱ�д�κδ��룬��Ϊ��Щ������Զ��ִ�в��������Ա��뱨��

*/

public class MethodTest09{

	public static void main(String[] args){

		/*
		int retValue = m();
		System.out.println(retValue);
		*/

		System.out.println(m());
		
	}


	// ���뱨��ȱ�ٷ�����䣬���³����������Ϊ���޷��ٷְٱ�֤ ��return 1;�� ����ִ��	
	/*
	public static int m(){
		int a = 10;
		if(a > 3){
			return 1;
		}
	}
	*/

	// ���������Ա�֤��һ������һ��return����ִ�У�����ͨ��
	/*
	public static int m(){
		int a = 10;
		if(a > 3){
			return 1;
		}else{
			return 0;
		}
	}
	*/

	// ���ԣ������Ϸ�����ȫ��ͬ
	/*
	public static int m(){
		int a = 10;
		if(a > 3){
			return 1;
		}
		return 0;
	}
	*/

	/*
	public static int m(){
		int a = 10;
		if(a > 3){
			return 1;
			// System.out.println("Hello"); // ���ﲻ�ܱ�д���룬�����������޷����ʵ����
		}
		System.out.println("Hello"); // ����
		return 0;
		// System.out.println("Hello"); // �����������޷����ʵ����
	}
	*/

	// ���򻹿�������д
	public static int m(){

		return 10 > 3 ? 1 : 0;
	}

}