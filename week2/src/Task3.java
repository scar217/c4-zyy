import java.util.Scanner;
/*3.找出字符串中的数字：
示例 1：
输入：str=”233hello15aop999”
输出：[233,15,999]*/
public class Task3 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        String str1;
        int i,j;
        char a=48;
        System.out.println("输入一个字符串：");
        str1 = scanf.nextLine();
        System.out.print("[");
        for(i=0;i<str1.length();i++){
            if(48<=str1.charAt(i)&&57>=str1.charAt(i)){
                System.out.print(str1.charAt(i));
            }
        }
        System.out.print("]");
    }
}
