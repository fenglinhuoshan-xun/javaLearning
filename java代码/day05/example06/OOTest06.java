/*
	����
		����һ��������ࡾ����/�ʼǱ��������������Щ�����أ�
			* Ʒ��
			* �ͺ�
			* ��ɫ
		����һ��ѧ���࣬ѧ��������Щ�����أ�
			* ѧ�� 
			* ����
			* ѧ����һ̨�ʼǱ�����

		���д��������ʾ���ϵ��࣬�ֱ��ഴ��Ϊ���󣬶����������ޣ�Ȼ�������е�һ��ѧ����ȥʹ��һ̨�ʼǱ�����
		���벢���У�����������ִ�й��̲���ͼ�εķ�ʽ��������

���еĴ���ȫ��д����ǰ��javaԴ�ļ�����
*/

// �������
class Computer{

	String brand;
	String model;
	String color;

}

// ѧ����
class Student{

	String id;
	String name;
	Computer computer;
}


// ������
public class OOTest06{

	public static void main(String[] args){
		
		Student s01 = new Student();
		Computer c01 = new Computer();

		// �����ѧ���ͱʼǱ�����������ϵ��ͨ��ѧ�����ҵ��ʼǱ����ԡ� 
		s01.computer = c01;

		s01.name = "����";
		c01.brand = "ƻ��";
		c01.model = "14Ӣ��";
		c01.color = "����ɫ";

		System.out.println(s01.name + "ʹ�õ��ǣ�" + s01.computer.color + s01.computer.model + s01.computer.brand + "����");

	}
}







