public class Test{
	public static void main(String[] args){
		// ������ʦ����
		// cooker1�ǲ˵�1����˼
		// FoodMenu cooker1 = new ChinaCooker();
		FoodMenu cooker1 = new AmericCooker();

		// �����˿Ͷ���
		Customer customer = new Customer(cooker1);

		// �˿͵��
		// customer.order(); // �����˵�����������ʱ�ͻ���ֿ�ָ���쳣����ָ���쳣�������÷���ʵ�����������
		customer.order(); 
	}
}