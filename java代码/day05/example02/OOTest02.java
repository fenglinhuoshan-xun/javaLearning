// ������
public class OOTest02{

	public static void main(String[] args){
		
		// ����User����
		// u�Ǿֲ�����
		// u��һ������
		// u�����ڴ��ַ��ָ����ڴ��User����
		User u = new User();

		// ���User�����ڲ�ʵ��������ֵ
		System.out.println(u.no); // 0
		System.out.println(u.name); // null
		System.out.println(u.addr); // null

		// �޸�User�����ڲ�ʵ��������ֵ
		u.no = 110;
		// �ַ����Ƚ����⣬����new��Ҳ�ᴴ������һ����صĶ���
		// �ַ���ÿ�θ�ֵ��ʱ���ȴ���һ���ַ������󣬶�������洢��ֵ
		// name�д洢�����ַ�������
		u.name = "jack"; // "jack"��һ��java��������String����
		u.addr = new Address();

		// ��main�������У�Ŀǰֻ�ܿ���һ������u
		// һ�ж���ֻ��ͨ��u�����з���
		System.out.println(u.name + "��ס���ĸ����У�" + u.addr.city);
		System.out.println(u.name + "��ס���ĸ��ֵ���" + u.addr.street);
		System.out.println(u.name + "�ʱࣺ" + u.addr.zipcode);
		
		u.addr.city = "����";
		u.addr.street = "����";
		u.addr.zipcode = "11111111";

		System.out.println(u.name + "��ס���ĸ����У�" + u.addr.city);
		System.out.println(u.name + "��ס���ĸ��ֵ���" + u.addr.street);
		System.out.println(u.name + "�ʱࣺ" + u.addr.zipcode);
	}
}

/*
	���ÿ����Ǿֲ�������Ҳ�����ǳ�Ա����/ʵ������
*/