// �˿�
public class Customer{
	// �˿�������һ���˵�
	// Customer has a FoodMenu����仰ʲô��˼���˿���һ���˵���
	// ��ס���Ժ����ܹ�ʹ�� has a �����ģ�ͳһ�����Եķ�ʽ����
	// ����һ��ʵ������/����
	// ��������̣�����ӿڱ�̣����ͳ̶ȵ���϶ȣ���߳������չ��
	// FoodMenu�������������ͣ�foodMenu������
	private FoodMenu foodMenu; // ��Ҫ���ɷ�װ�ĺ�ϰ��
	
	// �����������д���ͱ�ʾд���ˣ������ˡ�û�пɲ���ˣ�
	/*
	�вͳ�ʦ
	ChinaCooker cc;

	���ͳ�ʦ
	AmericCoker ac; 
	*/

	// ���췽��
	public Customer(){
		
	}

	public Customer(FoodMenu foodMenu){
		this.foodMenu = foodMenu;
	}

	public FoodMenu getFoodMenu(){
		return foodMenu;
	}

	public void setFoodMenu(FoodMenu foodMenu){
		this.foodMenu = foodMenu;
	}

	// �ṩһ����˵ķ���
	public void order(){
		// ���õ��˵����ܵ��
		// ����get�����õ��˵�
		FoodMenu fm = this.getFoodMenu();
		// Ҳ���Բ�����get��������Ϊ�ڱ�����˽�е������ǿ��Է��ʵ�
		foodMenu.shiZiChaoJiDan();
		foodMenu.yuXiangRouSi(); // this.���Բ�д
	}

}

/*
	Cat is a Animal���������� is a �ı�ʾ������������Ϊ�̳�
	Customer has a FoodMenu������������ has a �ı�ʾ�������Ե���ʽ����
*/
