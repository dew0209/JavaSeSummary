package chapter3.arryay.d_3_9;

/**
 * 可以百度找找资料，这个确实比较难了。
 * 杨辉三角：
 *     C(n,k) = C(n - 1,k - 1) + C(n - 1,k)
 *            = n * (n - 1) * (n - 2) * ... * (n - k + 1) / k!
 */
public class LotteryArray {
    public static void main(String[] args) {
        final  int NMAX = 10;
        int[][] odds = new int[NMAX + 1][];
        for(int n = 0;n <= NMAX;n++)odds[n] = new int[n + 1];
        for(int n = 0;n < odds.length;n++){
            for(int k = 0;k < odds[n].length;k++){
                int lotterytOdds = 1;
                for (int i = 1;i <= k;i++) {
                    lotterytOdds = lotterytOdds * (n - i + 1) / i;
                }
                odds[n][k] = lotterytOdds;
            }
        }
        for(int[] row : odds){
            for(int item : row){
                System.out.printf("%4d",item);
            }
            System.out.println();
        }
    }
}
