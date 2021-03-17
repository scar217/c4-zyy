import java.util.Scanner;import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = null, n = null;
            System.out.println("输入一个字符串：");
            str = scan.next();
            System.out.println("需要查找的字符串：");
            n = scan.next();
            if(!str.contains(n)){
                System.out.println("没有找到");
            }else{
                System.out.println(str.indexOf(n));
            }
        }
}
