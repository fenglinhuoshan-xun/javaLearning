/*
	forѭ��Ƕ��
*/

public class ForTest07{

	public static void main(String[] args){
		
		/*
		for(int i=0; i<10; i++){ // ѭ��10��
			for(int j=0; j<1; j++){
				System.out.println("j --> " + j);
			}
			
		} 
		*/

		for(int i=1; i<=5; i++){
			System.out.println("��ʼ");
			for(int j=1; j<=5; j++){
				// System.out.println(j);
				System.out.println(i * j);
			}
			System.out.println("����");
		}
	}
}