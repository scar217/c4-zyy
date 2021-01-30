import java.util.Scanner;

/*声明并测试一个复数类，其中包括 add()、reduce()、multiply()三种方法，分别实现两
个复数的相加、相减、相乘，然后输出计算的结果。
示例：（第一行输入两个数字分别表示第一个复数的实部和虚部、第二行输入的两个数字表
示第二个复数的实部和虚部）
输入：
2 3
1 2
输出：
两复数相加的结果为：3+5i
两复数相减的结果为：1+i
两复数相乘的结果为：-4+7i*/
public class Task7 {
    public static void main(String[] args){
        int a1,b1,a,b;
        Scanner scanf = new Scanner(System.in);
        fushu p1 = new fushu();
        System.out.println("输入第一个复数:(a+bi)");
        a = scanf.nextInt();
        b = scanf.nextInt();
        System.out.println("输入第二个复数:(a1+b1i)");
        a1 = scanf.nextInt();
        b1 = scanf.nextInt();
        p1.add(a,b,a1,b1);
        p1.reduce(a,b,a1,b1);
        p1.multiply(a,b,a1,b1);
    }
}
class fushu{
    public void add(int a,int b,int a1,int b1){
        if(b+b1>=0) {
            System.out.printf("两复数相加的结果为：%d+%di\n", a + a1, b + b1);
        }
        else{
            System.out.printf("两复数相加的结果为：%d%di\n",a+a1,b+b1);
        }
    }
    public void reduce(int a,int b,int a1,int b1){
        if(b-b1>=0) {
            System.out.printf("两复数相减的结果为：%d+%di\n",a-a1,b-b1);
        }
        else{
            System.out.printf("两复数相减的结果为：%d%di\n",a-a1,b-b1);
        }
    }
    public void multiply(int a,int b,int a1,int b1){
        if(a*b1+a1*b>=0){
            System.out.printf("两复数相乘的结果为：%d+%di\n",a*a1-b*b1,a*b1+a1*b);
        }
        else {
            System.out.printf("两复数相乘的结果为：%d%di\n",a*a1-b*b1,a*b1+a1*b);
        }
    }
}