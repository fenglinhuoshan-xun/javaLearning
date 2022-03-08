/*编写java程序，用于显示人的姓名和年龄
定义一个人类Person，该类中应该有两个私有属性：姓名name和年龄age
定义构造方法，用来初始化数据成员，再定义显示display方法，将姓名和年龄打印出来
在main中创建人类的实例，然后将信息显示*/
public class Homework5 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(20);
        p1.display();

        Person p2 = new Person("李四",12);
        p2.display();

        Person p3 = new Person();
        p3.display();
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        // System.out.println("姓名：" + this.getName() + "年龄：" + this.getAge());

        // 因为是在本类中访问，所以可以直接访问私有变量，而不用通过set/get方法
        // System.out.println("姓名：" + this.name + "年龄：" + this.age);
        System.out.println("姓名：" + name + " \n年龄：" + age);

    }
}
