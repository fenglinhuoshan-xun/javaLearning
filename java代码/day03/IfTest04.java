/*
	if���
*/

public class IfTest04{

	public static void main(String[] args){
		
		boolean sex = true;

		if(sex){
			System.out.println("��");
		}else{
			System.out.println("Ů");
		}

		sex = false;
		if(sex) System.out.println("��"); else System.out.println("Ů");

		// ---------------------------------------------------------------

		if(sex)
			System.out.println("��"); // ��if����ʱ��һ�д���
			System.out.println("�Ǻ�"); // if����ٲ�Ӱ�����г����ִ��
		else // �����б�����������25�У�25������û�д��󣬴�����ʾ��elseȱ��if��������if��û��else
			System.out.print("Ů");

	}
}