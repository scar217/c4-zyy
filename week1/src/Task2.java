/*计算 1000 以内的水仙花数有多少个*/
public class Task2 {
    public static void main(String[] args){
        int a,b,c,num,i;
        for(i=1;i<1000;i++){
            a = i%10;
            b = (i%100-a)/10;
            c = i/100;
            num = a*a*a+b*b*b+c*c*c;
            if(i==num){
                System.out.println(i);
            }
        }
    }
}
