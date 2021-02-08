import java.util.Scanner;
/*一个类 Game 有一个成员变量 v，v 有一个初值 100。
 定义一个方法 guess，对 Game 类的成员变量 v，用你输入的数字进行猜。
 如果大了则提示大了，小了则提示小了。直到猜对才停止*/
public class Task4 {
    public static void main(String[] args){
        Game g = new Game();
        Scanner scanf = new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        int a = scanf.nextInt();
        g.guess(a);
        System.out.println("恭喜你！猜对了");
    }
}
class Game{
    Scanner scanf = new Scanner(System.in);
    int v=100;
    public void guess(int a){
        while(a!=v){
            if(a>v){
                System.out.println("猜得有点大，再试一下吧");
                a = scanf.nextInt();
            }
            else{
                System.out.println("猜得有点小，再试一下吧");
                a = scanf.nextInt();
            }

        }
    }
}