/*
	����
		����ϵͳ����һ���˵����䣬���������Ҫ�Ӽ�������
		�����������ж�����˴����������ĸ��׶Σ����������[0~150]
			[0~5]		�׶�
			[6~10]		�ٶ�
			[11~18]		������
			[19~35]		����
			[36~55]		����
			[56~150]	����

*/

public class IfTest02{

	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�������������䣺"); // �����ʾ��Ϣ��Ҫ��Ȼ�û�������֪������Ҫ����

		int age = s.nextInt(); // ͣ�����ȴ��û������룬����֮���Զ����գ���ֵ��age����

		String stage = "�׶�";

		if(age < 0 || age > 150){
			stage = "�������������������ֵ��Ҫ��[1~150]֮��";
		}else if(56 <= age){
			stage = "����������׶�";
		}else if(36 <= age){
			stage = "����������׶�";
		}else if(19 <= age){
			stage = "����������׶�";
		}else if(11 <= age){
			stage = "������������׶�";
		}else if(6 <= age){
			stage = "����������׶�";
		}

		System.out.println(stage);

	}
}