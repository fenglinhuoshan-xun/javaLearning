/*
	����ִ�н����
		����
		�������ڹ��
		�������ڹ��
		�������ڹ��
*/
public class SuperTest04{

	public static void main(String[] args){
		Vip v = new Vip("����");
		System.out.println(v.name);
		v.shopping();
		
	}
}

class Customer{
	String name;

	public Customer(){
		
	}

	public Customer(String name){
		this.name = name;
	}
}

class Vip extends Customer{
	// �̳й�����name�Ǹ�����������name����
	public Vip(){
		
	}

	public Vip(String name){
		super(name);
		// this.name = name; // ���Լ���name����
	}

	// super��this�����ܳ����ھ�̬��������
	public void shopping(){
		// this��ʾ��ǰ����
		System.out.println(this.name + "���ڹ��");
		// super��ʾ���ǵ�ǰ����ĸ�������������super��thisָ����Ǹ������е�һ��ռ䣩
		System.out.println(super.name + "���ڹ��");
		// ʵ�������еľֲ�����ǰ�����ʲôҲû�еĻ���Ĭ�ϼ�this����name = this.name
		System.out.println(name + "���ڹ��");
		
	}
}
