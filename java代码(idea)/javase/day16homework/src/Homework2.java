/*
请定义一个交通工具(Vehicle)的类：
    其中有属性：
    速度(spend)
    体积(size)等等
    方法移动(move())
    设置速度(setSpeed(int speed))
    加速speedUp()
    减速speedDown()等等

    然后在测试类Vehicle中的main()中实例化一个交通工具对象
    并通过方法给它初始化speed,size的值并且打印出来
    另外调用加速减速的方法对速度进行改变
*/

public class Homework2 {

    public static void main(String[] args) {
        // 通过无参数构造方法创建对象
        Vehicle v = new Vehicle();
        v.move();
        // 通过set方法给属性赋值
        v.setSpend(0);
        v.setSize(5);

        System.out.println("spend:" + v.getSpend());
        System.out.println("size:" + v.getSize());

        // 调用加速方法
        v.speedUp(10);
        System.out.println("spend:" + v.getSpend());

        // 调用减速方法
        v.speedDown(10);
        System.out.println("spend:" + v.getSpend());

        // 通过有参数构造方法创建对象
        // Vehicle v1 = new Vehicle(120,5);


    }

}

// 交通工具类
class Vehicle{
    // 速度
    private int spend;
    // 体积
    private int size;

    public Vehicle() {
    }

    public Vehicle(int spend, int size) {
        this.spend = spend;
        this.size = size;
    }

    public int getSpend() {
        return spend;
    }


    public void setSpend(int spend) {
        this.spend = spend;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // 交通工具的移动方法
    public void move(){
        System.out.println("交通工具：公共汽车，起步行驶");
    }

    // 加速方法
    public void speedUp(int addSpend){
        // 在原来速度的基础之上加
        // this就是当前的交通工具对象
        this.setSpend(this.getSpend() + addSpend);

    }

    // 减速方法
    public void speedDown(int subSpeed){
        // 减速是在原来基础之上减去
        // 最好有判断
        if(this.getSpend() >= subSpeed){
            this.setSpend(this.getSpend() - subSpeed);
        }else{
            System.out.println("停止");
        }


    }
}
