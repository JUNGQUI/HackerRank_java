package com.jk.algorithm.hackerrank.problem.electronicsShop;

public class ElectronicsShop {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int result = -1;

        for (int tk : keyboards) {
            for (int tu : drives) {
                if (result < tk + tu && tk + tu <= b) {
                    result = tk + tu;
                }
            }
        }

        return result;
    }
}
