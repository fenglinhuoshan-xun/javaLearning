/*
	�����ࣺ
		1. �������в�һ���г��󷽷������󷽷���������ڳ�������
		2. ��Ҫ���ۣ���Ҫ���������*****
			-- һ���ǳ������̳г����࣬���뽫�������еķ�����ʵ����
			-- ����java�﷨��ǿ�й涨�ģ�����ģ���Ȼ�������ͱ�����
			-- ����ĸ��ǻ���˵��д��Ҳ���Խ���ʵ�֣��Գ����ʵ�֣�
*/
public class AbstractTest02{

	public static void main(String[] args){
		// �ܲ���ʹ�ö�̬��
		// ����������ָ�������Ͷ���
		Animal a = new Bird(); // ����ת�ͣ��Զ�����ת����

		// ��������������
		// �Ժ��㶼�ǵ��õ�a.xxx
		// a��������Animal��Animal�ǳ����
		// ��������̣���Ҫ��������̣����ͳ������϶ȣ���߳������չ��
		// ���ֱ��˼�����OCPԭ��
		a.move();

		Animal x = new Cat();
		x.move();


		
	}
}

// ������
abstract class Animal{
	
	// ���󷽷�
	public abstract void move();
}

// ���ࣨ�ǳ���ģ�
// ����: Bird���ǳ����, ����δ����Animal�еĳ��󷽷�move()
/*
class Bird extends Animal{

}
*/


class Bird extends Animal{
	// ��Ҫ���Ӹ����м̳й����ĳ��󷽷����и���/��д������Ҳ���Խ�����ʵ�֡�
	// �ѳ���ķ���ʵ����
	public void move(){
		System.out.println("����ڷ��裡");
	}
}


/*
	��Щ���ݲ�������Ӳ������������
	������
		Animal�Ǹ��࣬�����ǳ����
		Animal�������������һ�����󷽷�move

		Bird�����࣬�����Ƿǳ����
		Bird�̳�Animal֮�󣬻Ὣ���󷽷��̳й�����
*/

// ���Bird�ǳ�����Ļ�����ô���Animal�м̳й����ĳ��󷽷�Ҳ���Բ�ȥ��д/����/ʵ��
/*
abstract class Bird extends Animal{
	
}
*/

class Cat extends Animal{
	public void move(){
		System.out.println("è����è��");
	}
}









