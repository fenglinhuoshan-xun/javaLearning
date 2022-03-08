/*在程序中经常要对时间进行操作，但是并没有时间类型的数据
那么我们可以自己实现一个时间类来满足程序中的需要
定义名为MyTime的类，其中应有三个整型成员：hour时minute分second秒
为了保证数据的安全性，这三个成员变量应该声明为私有
为MyTime类定义构造方法，以方便创建对象时初始化实例变量
再定义display方法，用于将时间信息打印出来
为MyTime类添加以下方法:
    addSecond(int sec)
    addMinute(int min)
    addHour(int hou)
    subSecond(int sec)
    subMinute(int min)
    subHour(int hou)

分别对时分秒进行加减运算*/
public class Homework3 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        t1.display();

        MyTime t2 = new MyTime(13,20,50);
        t2.display();

        t2.addSecond(5);
        t2.display();

        t2.addSecond(6);
        t2.display();

        t2.addSecond(50);
        t2.display();

        t2.addSecond(9);
        t2.display();

        t2.addSecond(121);
        t2.display();

        t2.setMinute(59);
        t2.display();

        t2.addSecond(60);
        t2.display();

    }
}

class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void display(){
        // System.out.println(this.hour + "时" + this.minute + "分" + this.second + "秒");
        System.out.println(this.getHour() + "时" + this.getMinute() + "分" + this.getSecond() + "秒");
    }

    // 这个题目主要就是锻炼set和get方法
    // 你要知道set方法就是赋值，get方法就是读取
    // 加秒
    public void addSecond(int sec){
        int oldSencond = this.getSecond();
        int newSencond = oldSencond + sec;
        int h1 = newSencond / 3600;
        int m1 = newSencond % 3600 / 60;
        int s1 = newSencond % 60;
        // 在原来的基础上再加秒
        this.setSecond(s1);
        // 再往下的内容与编程还有关系吗？没有，和数学有关系
        this.addHour(h1);
        this.addMinute(m1);

    }

    // 加分
    public void addMinute(int min){
        int oldMinute = this.getMinute();
        int newMinute = oldMinute + min;
        int h2 = newMinute / 60;
        int m2 = newMinute % 60;
        this.setMinute(m2);
        this.addHour(h2);
    }

    // 加时
    public void addHour(int hou){
        this.setHour(this.getHour() + hou);
    }

    // 减秒
    public void subSecond(int sec){
        int oldSencond = this.getSecond();
        int newSencond = oldSencond + sec;
        int h1 = newSencond / 3600;
        int m1 = newSencond % 3600 / 60;
        int s1 = newSencond % 60;
        // 在原来的基础上再加秒
        this.setSecond(s1);
        // 再往下的内容与编程还有关系吗？没有，和数学有关系
        this.addHour(h1);
        this.addMinute(m1);
    }

    // 减分
    public void subMinute(int min){
        int oldMinute = this.getMinute();
        int newMinute = this.getMinute() + min;
        int h2 = newMinute / 60;
        int m2 = newMinute % 60;
        this.setMinute(m2);
        this.addHour(h2);
    }

    // 减时
    public void subHour(int hou){
        this.setHour(this.getHour() - hou);
    }
}

/*
    运算结果：
    0时0分0秒
    13时20分50秒
    13时20分55秒
    13时21分1秒
    13时21分51秒
    13时22分0秒
    13时24分1秒
    13时59分1秒
    14时0分1秒*/
