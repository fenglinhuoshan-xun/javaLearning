public class OOTest05{

	public static void main(String[] args){
		
		Customer c = new Customer();
		System.out.println(c.id); // 0

		c = null;
		// ���³���������ͨ������Ϊ�����﷨��c��������Customer�����Կ���c.id
		// ���г��ֿ�ָ���쳣
		// �����÷��ʡ�ʵ������ص����ݣ�һ������ֿ�ָ���쳣
		// java.lang.NullPointerException
		System.out.println(c.id); // 
	}
}

// ��ʵ������ص����ݱ�ʾ��������ݷ��ʵ�ʱ�򣬱���Ҫ�ж���Ĳ��룬�������ݾ���ʵ����صı���
