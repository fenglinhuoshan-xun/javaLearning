public class OOTest04{

	public static void main(String[] args){
		
		// ����һ���ɷ����
		Husband huangXiaoMing = new Husband();
		huangXiaoMing.name = "������";

		// ����һ�����Ӷ���
		Wife baby = new Wife();
		baby.name = "baby";

		// ��顾��ͨ���ɷ��ҵ����ӣ�ͨ������Ҳ�����ҵ��ɷ�
		huangXiaoMing.w = baby;
		baby.h = huangXiaoMing;

		// �õ����ϡ��������������ӵ�����
		System.out.println(huangXiaoMing.name + "�����ӵ����ֽУ�" + huangXiaoMing.w.name);

	}
}