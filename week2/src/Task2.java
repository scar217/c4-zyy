/*2. 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符
串 ""*/
public class Task2 {
    public static void main(String[] args){
        int j=0,i=0,a;
        int b=0;
        Min min = new Min();
        /*Scanner scanf = new Scanner(System.in);
        String[] str1 = new String[3];
        System.out.println("输入一个字符串数组：");
        for(int m=0;m<str1.length;m++){
            str1[m] = scanf.nextLine();
        }*/
        String[] str1 = new String[]{"flower","flow","flight"};
        int c = min.research(str1);//找出数组元素中字符串的最小
        for(;i<c;i++){
        for(a=1;a<str1.length;a++){
            if(str1[0].charAt(i) != str1[a].charAt(i)){
                b++;
                break;
            }
        }
        if(b==0){
        System.out.print(str1[0].charAt(i));
        j++;
        }
    }
        if(j==0){//没有公共前缀
            System.out.println("\0");
        }
    }
}
class Min{//寻找数组中个元素字符串最小的数：
    public int research(String[] str1){
        int i=0,j=str1[0].length();
        for(i=0;i<str1.length;i++){
            if(str1[0].length()>=str1[i].length()){
                j = str1[i].length();
            }
        }
        return j;
    }
}