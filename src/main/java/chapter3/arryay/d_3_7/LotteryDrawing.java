package chapter3.arryay.d_3_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 随机数值的组合[抽彩游戏]
 * 利用Math.random()生成一个[0,1)的随机浮点数。乘n得到一个[0,n-1]之间的随机数（转为int）.
 * 设 r = (int)(Math.random() * n);
 * 将数组的第i个元素设置为number[r]存放的值
 * 将numbers[r] = numbers[n],n--;
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need draw?");
        int k = in.nextInt();
        System.out.println("what is the highest number you can draw?");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0;i < numbers.length;i++){
            numbers[i] = i + 1;
        }
        int[] result = new int[k];
        for(int i = 0;i < result.length;i++){
            int r = (int)(Math.random() * n);//[0,1) * n --> [0,n)
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Bet the following combination,It will make you rich!");
        for(int r : result)
            System.out.println(r);
    }
}
