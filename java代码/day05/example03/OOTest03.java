public class OOTest03{

	public static void main(String[] args){
		
		// u������
		// u�Ǿֲ�����
		User u = new User();

		// ��һ���汾�б�д��
		// u.addr = new Address();

		// a�Ǿֲ�����
		// a������
		Address a = new Address();
		u.addr = a;

		System.out.println(u.addr.city); // null

		a.city = "���";
		System.out.println(u.addr.city); // ���

	}
}