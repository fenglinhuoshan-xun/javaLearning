public class SwitchTest03{

	public static void main(String[] args){
		
		// char c = 'A';
		// char c = 65;
		 char c = 'B';
		// char c = 'D';

		switch(c){
			case 'A' : // switch��case���棬ֻ�ܸ�int���ͺ�String���͵����ݣ�char����Ҳ��д���Զ�����ת��
				System.out.println("�߼�");
				break;
			case 'B' :
				System.out.println("�м�");
				break;
			case 'C' :
				System.out.println("����");
				break;
			default :
				System.out.println("�����ˣ�");
		}

		switch(c){
			case 'A' :
				System.out.println("�߼�");
				break;
			case 66 :
				System.out.println("�м�");
				break;
			case 'C' :
				System.out.println("����");
				break;
			default :
				System.out.println("�����ˣ�");
		}
	}
}