/*
	continue��䣺
		1. continue��ʾ������/go on/��һ��

		2. continueҲ����һ��continue�ؼ��ּ�һ���ֺţ�����һ��������������java��䣬��Ҫ����ѭ����䵱�У���������ѭ����ִ��

		3. break��continue������
			* break��ʾѭ����ִ����
			* continue��ʾ��ֹ��ǰ�����Ρ�ѭ����ֱ�ӽ�����һ��ѭ��������ִ��

		4. continueҲ��������˵����
			continue ѭ������; ����Ϊ�˽����ݡ�
*/

public class ContinueTest01{

	public static void main(String[] args){
		
		for(int i = 0; i < 10; i ++){
			if(i == 5){
				break;
			}
			System.out.println("i = " + i); // 0 1 2 3 4
		}

		System.out.println("Hello World");

		for(int i = 0; i < 10; i ++){
			if(i == 5){
				continue; // ֻҪ������ִ�У���ǰ����ѭ��ֹͣ��ֱ�ӽ�����һ��ѭ����������ִ��
			}
			System.out.println("i = " + i); // 0 1 2 3 4 6 7 8 9 10
		}

		System.out.println("Hello World");

		myfor:for(int i = 0; i < 10; i ++){
			if(i == 5){
				continue myfor; // continue�������ָ��ѭ�����ƣ�����һ��ѭ����ת���ĸ�ѭ����ȥִ��
			}
			System.out.println("i = " + i); // 0 1 2 3 4 6 7 8 9 10
		}

		System.out.println("Hello World");
	}
}