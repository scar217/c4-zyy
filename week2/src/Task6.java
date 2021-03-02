import java.nio.FloatBuffer;
import java.util.Scanner;

/*6. 编写一个 Java 应用程序，设计一个汽车类 Vehicle，包含的属性有车轮个数 wheels 和车重
weight。小车类 Car 是 Vehicle 的子类，其中包含的属性有载人数 loader。卡车类 Truck 也是
Vehicle 的子类，其中包含的属性有载人数 loader 和载重量 payload。每个类都有构造方法和
输出相关数据的方法。最后，写一个测试类来测试这些类的功能。
*/
public class Task6 {
    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);
        int wheels;
        while(true){
            System.out.println("请输入车子轮胎数：");
            wheels = scanf.nextInt();
            if(wheels==4||wheels==6){
                break;
            }
            System.out.println("输入有误，重新输入！！！");
        }
//用车子轮胎数判断车子类型
            if (wheels == 4) {
                Car c = new Car(wheels);
                System.out.println("输入车载人数");
                int loader = scanf.nextInt();
                c.Fun(loader, wheels, c.weight);
            } else {
                System.out.println("请输入车载人数");
                int loaders = scanf.nextInt();
                System.out.println("请输入车载货量");
                double payload = scanf.nextDouble();
                Truck t = new Truck(loaders, payload);
                t.Fun();
            }
    }
}
class Vehicle{
    int wheels;//车轮个数
    double weight;//车重
    public Vehicle(int wheels,double weight){
        this.weight = weight;
        this.wheels = wheels;
    }
    public Vehicle(){
    }
}
class Car extends Vehicle{
    int loader;//车载人数
    int overPerson = 5;//
    public Car(int loader){
        super(4,1150);
        this.loader = loader;
    }
    public void Fun(int loader,int wheels,double weight){
        System.out.println("车轮个数是："+wheels+"\t车重是："+weight);
        if(loader>=overPerson){
            System.out.println("这是一辆小车，能载6人，实载"+loader+"人;你超员啦！！");
        }else{
            System.out.println("这是一辆小车，能载6人，实载"+loader+"人");
        }
    }


}
class Truck extends Vehicle{
    int loader;//车载人数
    double payload;//载重量
    int overPerson = 3;//
    public Truck(int loader,double payload){
        super(6,1150);
        this.loader = loader;
        this.payload = payload;
    }
    public void Fun(){
        System.out.println("车轮个数是："+wheels+"\t车重：1150");
        if(loader<3){
            System.out.println("这是一辆卡车，能载3人，实载："+loader);
        }else{
            System.out.println("这是一辆卡车，能载3人，实载："+loader+"。你超员啦！");
        }
        if(payload<=5000){
            System.out.println("这是一辆卡车，核载5000kg，你已装载："+payload+"kg");
        }else {
            System.out.println("这是一辆卡车，核载5000kg，你已装载："+payload+"kg;你已超载啦！");
        }
    }
}