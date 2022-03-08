/*
	1. ��this.���͡�super.���ڴ󲿷�����¶��ǿ���ʡ�Ե�
	2. this.ʲôʱ����ʡ�ԣ�
		public void setName(String name){
			this.name = name;
		}
	3. super.ʲôʱ����ʡ�ԣ�
		�����У��������У�����������з��ʡ�����������������������Ӷ����з��ʸ����͵�ͬ������ʱ����super.����ʡ��
*/

/*
	����ִ�н����
		null���ڹ��
		�������ڹ��
		null���ڹ��
		����doSome!
		����doSome!
*/

public class SuperTest05{

	public static void main(String[] args){
		Vip v = new Vip("����");
		v.shopping();

		v.doSome();
		
	}
}

class Customer{
	String name;

	public Customer(){
		
	}

	public Customer(String name){
		this.name = name;
	}

	public void doSome(){
		System.out.println(this.name + "doSome!");
		System.out.println(name + "doSome!");
		// �����Ҳ�������
		// System.out.println(super.name + "doSome!");
	}
}

class Vip extends Customer{

	// ��������Ҳ��һ��ͬ������
	// java�������������г��ֺ͸���һ����ͬ������/ͬ������
	String name; // ʵ�����������󼶱�ı���

	public Vip(){
		
	}

	public Vip(String name){
		super(name);
		// this.name = null;
	}

	// super��this�����ܳ����ھ�̬��������
	public void shopping(){

		/*
			java����ô����������͸����ͬ�����Եģ�
				this.name����ǰ�����name����
				super.name����ǰ����ĸ����������е�name����
		*/

		// this��ʾ��ǰ����
		System.out.println(this.name + "���ڹ��");
		// super��ʾ���ǵ�ǰ����ĸ�������������super��thisָ����Ǹ������е�һ��ռ䣩
		System.out.println(super.name + "���ڹ��"); 
		// ʵ�������еľֲ�����ǰ�����ʲôҲû�еĻ���Ĭ�ϼ�this����name = this.name
		System.out.println(name + "���ڹ��");
		
	}
}
