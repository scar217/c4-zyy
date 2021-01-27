/*1. 请用 if ... else 编写一个程序，用于计算体质指数 BMI，并打印结果。
BMI = 体重(kg)除以身高(m)的平方
BMI 结果：
过轻：低于 18.5
正常：18.5-25
过重：25-28
肥胖：28-32
非常肥胖：高于 32*/
import org.omg.CORBA.IMP_LIMIT;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double BMI,high,weigh;
        System.out.println("输入体重(kg)：");
        weigh = s.nextDouble();
        System.out.println("输入身高(m)：");
        high = s.nextDouble();
        BMI = Math.pow(weigh / high,2);
        if(BMI<18.5){
            System.out.println("过轻");
        }
        else if(BMI>=18.5||BMI<25){
            System.out.println("正常");
        }
        else if(BMI>=25||BMI<28){
            System.out.println("过重");
        }
        else if(BMI>=28||BMI<32){
            System.out.println("肥胖");
        }
        else{
            System.out.println("非常肥胖");
        }
    }
}
