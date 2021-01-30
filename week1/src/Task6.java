import java.util.Scanner;
/*编写一个银行账户类，类的构成包括：
        数据成员：用户的账户名称、用户的账户余额;
        方法包括：开户（设置账户名称及余额, 利用构造方法完成)；查询余额。*/
public class Task6 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        bank p1 = new bank();
        p1.kaihu();
    }
}
class bank{
    String[] name = new String[30];
    double[] count = new double[30];
    int i=0;
    Scanner scanf = new Scanner(System.in);
    public void kaihu(){
        for(i=0;i<30;i++) {
            System.out.println("输入您的姓名：");
            name[i] =scanf.nextLine();
            System.out.println("您的余额还有"+count[i]);
        }
    }
}