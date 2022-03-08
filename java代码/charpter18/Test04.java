
// String对象比较的时候，必须使用equals方法
public class Test04{
	public static void main(String[] args){
		Student s1 = new Student(111,"北京大兴亦庄二小");
		Student s2 = new Student(111,"北京大兴亦庄二小");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

		/*
		Student s3 = new Student(111,new String("北京大兴亦庄二小"));
		Student s4 = new Student(111,new String("北京大兴亦庄二小"));
		System.out.println(s3 == s4); // false
		System.out.println(s3.equals(s4)); // false
		*/
	}
}

class Student{
	// 学号
	int no; // 基本数据类型，比较时使用：==
	// 所在学校
	String school; // 引用数据类型，比较时使用：equals方法

	public Student(){}
	public Student(int no,String school){
		this.no = no;
		this.school = school;
	}

	// 重写toString方法
	public String toString(){
		return "学号" + no + ",所在学校" + school;
	}

	// 重写equals方法
	// 需求：当一个学生的学号相等，并且学校相同时，表示同一个学生
	// 思考，这个equals方法该怎么重写呢？
	// equals方法的编写模式都是固定的，架子都差不多
	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Student)) return false;
		if(this == obj) return true;
		Student s = (Student)obj;
		return this.no == s.no && this.school.equals(s.school);

		// 字符串用双等号比较行吗？
		// 不可以
		// return this.no == s.no && this.school == s.school;
	}

}
