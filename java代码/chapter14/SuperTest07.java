/*
	�ڸ���������ͬ�������ԣ�����˵����ͬ�ķ����������ʱ���������з��ʸ��е����ݣ�����ʹ�á�super.����������

	super.������;�����ʸ�������ԡ�
	super.������(ʵ��);�����ʸ���ķ�����
	super(ʵ��);�����ʸ���Ĺ��췽����
*/


/*
	����ִ�н����
		Cat move!
		Cat move!
		Animal move!
*/

public class SuperTest07{

	public static void main(String[] args){
		Cat c = new Cat();
		c.yiDong();
		
	}
}

class Animal{

	public void move(){
		System.out.println("Animal move!");
	}
}

class Cat extends Animal{

	// ��move������д
	public void move(){
		System.out.println("Cat move!");
	}

	// ������дһ���������еķ���
	public void yiDong(){
		this.move();
		move();
		// super.�������Է������ԣ�Ҳ���Է��ʷ���
		super.move();
	}
}