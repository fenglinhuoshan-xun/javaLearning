/*
	����Object���е�toString()����
		1. toString()������������ʲô��
			���ã�����java����ת���ɡ��ַ�������ʽ��

		2. Object����toString()������Ĭ��ʵ����ʲô��
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}	
		toString()������������˼����ת����String
		���壺����һ��java�����toString()�������Ϳ��Խ���java����ת�����ַ����ı�ʾ��ʽ

		3. ��ôtoString()��������Ĭ��ʵ�ֹ�����
			�����õĻ��������Լ���д/����
*/

public class toStringTest02{

	public static void main(String[] args){

		// ����һ�����ڶ���
		MyDate t1 = new MyDate();
		// ����toString()������������ת�����ַ�����ʽ��
		// �ʣ������������������𣿲����⣬ϣ�������xxx��xx��xx��
		// ��дtoString()����֮ǰ�Ľ��
		// System.out.println(t1.toString()); // MyDate@15db9742

		// ��дtoString()����֮��Ľ��
		System.out.println(t1.toString()); // 2022��2��13��
		System.out.println(t1); // 2022��2��13��		
		
		// �����һ�������ʱ�򣬿��ܸ�Ը�⿴��һ������ľ�����Ϣ���������ڴ��ַ������Ҫ��д
		MyDate t2 = new MyDate(2008,8,8);
		System.out.println(t2); // 2008��8��8��
	}
}

// ������
class MyDate{
	private int year;
	private int month;
	private int day;
	public MyDate(){
		this(2022,2,13);
	};

	public MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getMonth(){
		return month;
	}

	public void setDay(int day){
		this.day = day;
	}

	public int getDay(){
		return day;
	}

	// ��Object���м̳й������Ǹ�toString�����Ѿ��޷�������ҵ��������
	// ��������MyDate���б�Ҫ�Ը����toString()�������и���/��д
	// �ҵ�ҵ�������ǵ���toString()���������ַ���ת����ʱ��ϣ��ת���Ľ���ǣ�xxx��xx��xx��
	// ��дһ��Ҫ����ճ������Ҫ�ֶ���д������
	public String toString() {
		return year + "��" + month + "��" + day + "��";
	}	

}
// ����������Ϊ�˶�̬����̬���ƣ���ʹ�ó�����к�ǿ����չ��