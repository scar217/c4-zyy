import java.util.Scanner;

/*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的 相对顺序*/
public class Task4 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        int N,i,j,temp;
        System.out.println("请输入一个数组的大小：");
        N = scanf.nextInt();
        int[] nums = new int[N];
        for(i=0;i<N;i++){
            System.out.println("输入一个数值：");
            nums[i] = scanf.nextInt();
        }
        for(j=0;j<N-1;j++) {
            for (i = 0; i < N-1; i++) {
                if (nums[i] == 0) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        //输出变换后的数组：
        for(i=0;i<N;i++){
            System.out.print("["+nums[i]+"]");
        }
    }
}
