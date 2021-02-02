import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        int n;
        System.out.println("输入矩阵的维数n:");
        n = scanf.nextInt();
        int[][] arr = new int[n][n];//定义一个主二维数组
        int[][] arr1 = new int[n][n];//定义一个辅助二维数组
        int i,j;
        for(i=0;i< arr1.length;i++){//从外界输入想要转化的数组
            for(j=0;j< arr1.length;j++){
                System.out.println("输入第"+(i+1)+"行"+"第"+(j+1)+"列的数");
                arr1[i][j] = scanf.nextInt();//按行输入
            }
        }
        n-=1;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                arr[j][n] = arr1[i][j];
            }
            n--;
        }
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                System.out.print("["+arr[i][j]+"]");
            }
            System.out.print("\n");
        }
    }

}
