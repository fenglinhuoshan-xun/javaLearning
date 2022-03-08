/*
	����Object���е�equals����
		1. equals��Դ���룺
		public boolean equals(Object obj) {
			return (this == obj);
		}
		-- ���������������Object���Ĭ��ʵ��
			* ��Object���е�equals�������У�Ĭ�ϲ��õ��ǡ�==���ж�����java�����Ƿ����
			* ����==���жϵ�������java������ڴ��ַ������Ӧ���ж�����java����������Ƿ����
			* ���������ڵ�equals���������ã���Ҫ������дequals����

		2. SUN��˾���equals������Ŀ����ʲô��
			�Ժ��̵Ĺ��̵��У���Ҫͨ��equals�������ж����������Ƿ����
			equals�������ж����������Ƿ���ȵ�

		3. ������Ҫ�о�һ��Object��������Ĭ�ϵ�equals�����������ã���

		4. �ж�����java�����Ƿ���ȣ�����ʹ�á�==������Ϊ��==���Ƚϵ�������������ڴ��ַ



*/

public class Test02{
	public static void main(String[] args){
		// �ж������������������͵������Ƿ����ʱ��ֱ��ʹ�á�==������
		int a = 100;
		int b = 100;
		// �����==�����ж�a�б����100��b�б����100�Ƿ����
		System.out.println(a == b); // true

		// �ж�����java�����Ƿ����ʱ��������ô�죿��ֱ��ʹ�á�==����
		// ����һ�����ڶ����ǣ�2008��8��8��
		MyTime t1 = new MyTime(2008,8,8);
		// ������һ���µ����ڶ��󣬵���ʾ������Ҳ�ǣ�2008��8��8��
		MyTime t2 = new MyTime(2008,8,8);

		// ����һ�£��Ƚ����������Ƿ���ȣ��ܲ���ʹ�á�==����
		// ����ġ�==���жϵ���t1�б���Ķ�����ڴ��ַ��t2�б���Ķ�����ڴ��ַ�Ƿ����
		System.out.println(t1 == t2); // false

		// ��дObject equals����֮ǰ���Ƚϵ��Ƕ�����ڴ��ַ��
		/*
		boolean flag = t1.equals(t2);
		System.out.println(flag); // false
		*/

		// ��дObject equals����֮�󣨱Ƚϵ������ݣ�
		boolean flag1 = t1.equals(t2);
		System.out.println(flag1); // true

		// �ٴ���һ���µ�����
		MyTime t3 = new MyTime(2008,8,9);
		System.out.println(t1.equals(t3)); // false

		// �������������bug�𣿿������У�����Ч����ô�����ͣ���ô���죿��
		MyTime t4 = null;
		System.out.println(t1.equals(t4)); // false


	}
}

class MyTime{
	int year;
	int month;
	int day;
	
	public MyTime(){
		
	}

	public MyTime(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/*
	public boolean equals(Object obj) {
		return (this == obj);
	}
	*/

	// ��дObject���equals����
	// ��ô��д������ճ������ͬ�ķ���ֵ���ͣ���ͬ�ķ���������ͬ����ʽ�����б�
	// equals����Ӧ����ô��д�����Լ���������Ϊ��������ʲô��ȵ�ʱ�򣬱�ʾ��ȣ������ô��д������
	/*
	public boolean equals(Object obj) {
		// ������ͬ������ͬ��������Ҳ��ͬ��ʱ�򣬱�ʾ����������ͬ�������������
		// ��ȡ��һ�����ڵ�������
		int year1 = this.year;
		int month1 = this.month;
		int day1 = this.day;
		// ��ȡ�ڶ������ڵ�������
		// int year2 = obj.year;
		// int month2 = obj.month;
		// int day2 = obj.day;

		if(obj instanceof MyTime){
			MyTime t = (MyTime)obj;
			int year2 = t.year;
			int month2 = t.month;
			int day2 = t.day;
			if(year1 == year2 && month1 == month2 && day1 == day2){
				return true;
			}
		}
		
		// �����ܹ�ִ�е��˴�����ʾ���ڲ����
		return false;
		
	}
	*/	
	
	/*
	// ����equals����
	public boolean equals(Object obj) {
		// ���objΪ�գ�ֱ�ӷ���false
		if(obj == null){
			return false;
		}
		// ���obj����һ��MyTime��û��Ҫ�Ƚ��ˣ�ֱ�ӷ���false
		if(!(obj instanceof MyTime)){
			return false;
		}
		// ���this��obj������ڴ��ַ��ͬ��û��Ҫ�Ƚ��ˣ�ֱ�ӷ���true
		// �ڴ��ַ��ͬ��ʱ��ָ��Ķ��ڴ�Ķ���϶���ͬһ��
		if(this == obj){
			return true;
		}
		// �����ܹ�ִ�е�����˵����ʲô��
		// ˵��obj����null��obj��MyTime����
		MyTime t = (MyTime)obj; 
		if(this.year == t.year && this.month == t.day && this.day == t.day){
			return true;
		}

		// �����ܵ��������false
		return false;
		
	}
	*/

	/*
	// �ٴθ���equals����
	public boolean equals(Object obj) {
		// ���objΪ�գ�ֱ�ӷ���false
		if(obj == null){
			return false;
		}
		// ���obj����һ��MyTime��û��Ҫ�Ƚ��ˣ�ֱ�ӷ���false
		if(!(obj instanceof MyTime)){
			return false;
		}
		// ���this��obj������ڴ��ַ��ͬ��û��Ҫ�Ƚ��ˣ�ֱ�ӷ���true
		// �ڴ��ַ��ͬ��ʱ��ָ��Ķ��ڴ�Ķ���϶���ͬһ��
		if(this == obj){
			return true;
		}
		// �����ܹ�ִ�е�����˵����ʲô��
		// ˵��obj����null��obj��MyTime����
		MyTime t = (MyTime)obj; 
		return this.year == t.year && this.month == t.day && this.day == t.day
	*/

	// �ٴθ���equals����
	public boolean equals(Object obj) {
		// ���objΪ�գ�ֱ�ӷ���false
		if(obj == null || !(obj instanceof MyTime)){
			return false;
		}
		if(this == obj){
			return true;
		}
		MyTime t = (MyTime)obj; 
		return this.year == t.year && this.month == t.day && this.day == t.day;
	}
	
}

/*
class Person{
	private String idCard;
}
*/