/*
	����Ĵ�����ʹ��
*/

public class OOTest01{

	public static void main(String[] args){
		
		// int�ǻ�����������
		// i��һ��������
		// 10��һ��int�������͵�����ֵ
		int i = 10;

		// ͨ��һ�������ʵ����N������
		// ʵ����������﷨��new ����();
		// new��java���Ե��е�һ�������
		// new����������ã�����������JVM���ڴ浱�п����µ��ڴ�ռ�
		// �������ڴ�������ص�ʱ��class�ֽ����ļ�������Ƭ�Σ������ص����ڴ�ռ䵱��
		// ջ�ڴ棨�ֲ�����������������Ƭ�α�����ִ�е�ʱ�򣬻���÷��������ڴ�ռ䣬��ջ�ڴ���ѹջ
		// ���ڴ棺new�Ķ����ڶ��ڴ��д洢
		// Student1��һ��������������
		// s��һ��������
		// new Student1()��һ��ѧ������
		// s��һ���ֲ���������ջ�ڴ��д洢��
		// ʲô�Ƕ���new������ڶ��ڴ��п��ٵ��ڴ�ռ䣬��Ϊ����
		// ʲô�����ã�������һ��������ֻ������������б�������һ��java������ڴ��ַ
		// ��Ϊ�ֲ�����s�б�����Ƕ�����ڴ��ַ���������ǽ�s��Ϊ����
		// java���Ե��У�����Ա����ֱ�Ӳ������ڴ棬java��û��ָ�룬����C����
		// java���Ե��У�����Աֻ��ͨ�������á�ȥ���ʶ��ڴ浱�У������ڲ���ʵ������
		Student1 s = new Student1();

		// ����ʵ���������﷨��ʽ��
		// ��ȡ���ݣ�����.������
		// �޸����ݣ�����.������ = ֵ

		int stuNO = s.no;
		String stuName = s.name;
		int stuAge = s.age;
		boolean stuSex = s.sex;
		String stuAddr = s.addr;

		/*
		System.out.println("ѧ�� = " + stuNO); // 0
		System.out.println("���� = " + stuName); // null
		System.out.println("���� = " + stuAge); // 0
		System.out.println("�Ա� = " + stuSex); // false
		System.out.println("סַ = " + stuAddr); // null
		*/

		System.out.println("ѧ�� = " + s.no); // 0
		System.out.println("���� = " + s.name); // null
		System.out.println("���� = " + s.age); // 0
		System.out.println("�Ա� = " + s.sex); // false
		System.out.println("סַ = " + s.addr); // null

		s.no = 10;
		s.name = "jack";
		s.age = 20;
		s.sex = true;
		s.addr = "����";

		// ��ͨ����ʵ����һ��ȫ�µĶ���
		// stu������
		// stuͬʱҲ��һ���ֲ�����
		// Student1�Ǳ�������������
		Student1 stu = new Student1();
		System.out.println(stu.no); // 0
		System.out.println(stu.name); // null
		System.out.println(stu.age); // 0
		System.out.println(stu.sex); // false
		System.out.println(stu.addr); // null

		// ���뱨��no���ʵ����������ֱ�Ӳ��á��������ķ�ʽ����
		// ��Ϊno��ʵ���������Ƕ��󼶱�ı����������洢��java������ڲ����������ж���
		// ͨ��������ܷ���no���ʵ������������ֱ��ͨ��������������
		// System.out.println(Student1.no); // 0
	}
}

// ��Ա����û���ֶ���ֵ�Ļ���ϵͳ��Ĭ��ֵ
// Ĭ��ֵ
/*
	��������				Ĭ��ֵ
	------------------------------
	byte,short,int,long		0
	float,double			0.0
	boolean					false
	char					\u0000
	������������			null ��ֵ
*/

/*
	�ֲ�������ջ�ڴ��д洢
	��Ա�����е�ʵ�������ڶ��ڴ�Ķ����ڲ��洢

	����ʵ��������һ������һ�ݣ�100���������100��
*/
