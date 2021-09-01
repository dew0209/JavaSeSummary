package chapter3.arryay.d_3_8;

/**
 * 数值表：显示在不同利率下投资10000会增长多少
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;
        double[] interestRate = new double[NRATES];
        for(int j = 0;j < interestRate.length;j++){
            interestRate[j] = (j + STARRATE) / 100;
        }
        double[][] balances = new double[NYEARS][NRATES];
        for(int j = 0;j < balances[0].length;j++){
            balances[0][j] = 10000;
        }
        for(int i = 1;i < balances.length;i++){
            for(int j = 0;j < balances[i].length;j++){
                double oldBalance = balances[i - 1][j];
                double interest = oldBalance * interestRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }
        for(int j = 0;j < balances[0].length;j++){
            System.out.printf("%9.0f%%",100 * interestRate[j]);
        }
        System.out.println();
        for(double[] row : balances){
            for (double b : row){
                System.out.printf("%10.2f",b);
            }
            System.out.println();
        }
    }
}
