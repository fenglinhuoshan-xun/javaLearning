/*
	����
		�жϵ�ǰ������
			����������ʱ��
				����ɡ��
					�ж��Ա�
						���Ա�Ϊ�У���һ�Ѵ��ɡ
						���Ա�ΪŮ����һ��С��ɡ
			
			������������ʱ��
				�ж��������¶ȣ�
					�������¶���30�����ϣ�
						���Ա�Ϊ�У���ī��
						���Ա�ΪŮ������ɹ˪

		����״�����¶ȡ��Ա���Ҫ�Ӽ�������
			����״����1��ʾ���ꡢ0��ʾ����
			�¶�ֱ��ʹ�����ּ���
			�Ա�1��ʾ�С�0��ʾŮ

		ע�⣺java�У��ַ�����������==���бȽ�

*/

public class IfTest03{
	
	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.println("��ӭʹ�ñ�ϵͳ����ͨ����ϵͳ�������һЩ�򵥵��ж�");
		System.out.println("˵��1��1��ʾ���꣬0��ʾ����");
		System.out.println("˵��2��1��ʾ�У�0��ʾŮ");
		System.out.println("˵��3���¶�Ϊ����");

		System.out.print("����������״����");	
		int weatherConditions = s.nextInt();

		System.out.print("�������Ա�");
		int gender = s.nextInt();

		if(weatherConditions == 1){
			if(gender == 1){
				System.out.println("��һ�Ѵ��ɡ");
			}else if(gender == 0){
				System.out.println("��һ��С��ɡ");
			}else{
				System.out.println("��������Ա�����");
			}			
		}else if(weatherConditions == 0){
			System.out.print("�������¶ȣ�");
			int temperature = s.nextInt();
			if(temperature > 30){
				if(gender == 1){
					System.out.println("��ī��");
				}else if(gender == 0){
					System.out.println("����ɹ˪");
				}else{
					System.out.println("��������Ա�����");
				} 
			}
			
		}else{
			System.out.println("���������������");
		}

	}
}
