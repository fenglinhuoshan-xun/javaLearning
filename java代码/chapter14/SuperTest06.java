/*
	ͨ��������Եó��Ľ��ۣ�
		-- super�������ã�superҲ�������ڴ��ַ��superҲ��ָ���κζ���
		-- superֻ�Ǵ������ǰ�����ڲ�����һ�鸸���͵�����
*/

public class SuperTest06{

	// ʵ������
	public void doSome(){
		// System.out.println(this);
		// ��������á���ʱ�򣬻��Զ��������õ�toString����
		System.out.println(this.toString()); // SuperTest06@15db9742

		// ���������Ҫ'.'
		// System.out.println(super);  // ���뱨��
	}


	// this��super����ʹ����static��̬��������
	/*
	public static void doOther(){
		System.out.println(this);
		System.out.println(super.xxx);
	}
	*/

	public static void main(String[] args){
		SuperTest06 st = new SuperTest06();
		st.doSome();
	}
}
