/*编写一个函数，其作用是将输入的字符串反转过来*/
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        String a;
        int i,j;
        char[] arr = new char[10];//定义一个字符数组，接收字符串中每个字符
        System.out.println("请输入一个字符串：");
        a = scanf.nextLine();//从键盘输入一个字符串
        for(i=0;i< a.length();i++){
            arr[i] = a.charAt(i);
        }
        for(j=a.length()-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
