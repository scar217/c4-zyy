import java.util.Scanner;

/*定义一个 Circle 类，其中成员变量 radius 表示圆的半径，编写方法 getArea() 计
算圆的面积、getPerimeter()计算圆的周长，并在主函数中构造一个 Circle 的对象进行测
试。
示例：
输入：3
输出：the area is 28.26
the perimeter is 18.84
 */
public class Task5 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        double radius;
        System.out.println("请输入圆的半径：");
        radius = scanf.nextDouble();
        Circle p1 = new Circle();
        p1.getArea(radius,Math.PI);//使用Math库里面的PI
        p1.getPerimeter(radius,Math.PI);
    }
}
class Circle{
    public void getArea(double radius,double N){
        double area;
        area = N*radius*radius;
        System.out.printf("the area is %.2f\n",area);
    }
    public void getPerimeter(double radius,double N){
        double perimeter;
        perimeter = 2*N*radius;
        System.out.printf("the perimeter is %.2f\n",perimeter);
    }
}
