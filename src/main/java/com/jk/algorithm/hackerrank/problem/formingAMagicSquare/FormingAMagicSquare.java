package com.jk.algorithm.hackerrank.problem.formingAMagicSquare;

public class FormingAMagicSquare {
    public int solution(int [][] s) {
        int[][] magic0 = {{8,1,6}, {3,5,7}, {4,9,2}};
        int[][] magic1 = {{6,1,8}, {7,5,3}, {2,9,4}};
        int[][] magic2 = {{4,9,2}, {3,5,7}, {8,1,6}};
        int[][] magic3 = {{2,9,4}, {7,5,3}, {6,1,8}};
        int[][] magic4 = {{8,3,4}, {1,5,9}, {6,7,2}};
        int[][] magic5 = {{4,3,8}, {9,5,1}, {2,7,6}};
        int[][] magic6 = {{6,7,2}, {1,5,9}, {8,3,4}};
        int[][] magic7 = {{2,7,6}, {9,5,1}, {4,3,8}};

        int[] sum = new int[8];

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                sum[0] += Math.abs(s[i][j] - magic0[i][j]);
                sum[1] += Math.abs(s[i][j] - magic1[i][j]);
                sum[2] += Math.abs(s[i][j] - magic2[i][j]);
                sum[3] += Math.abs(s[i][j] - magic3[i][j]);
                sum[4] += Math.abs(s[i][j] - magic4[i][j]);
                sum[5] += Math.abs(s[i][j] - magic5[i][j]);
                sum[6] += Math.abs(s[i][j] - magic6[i][j]);
                sum[7] += Math.abs(s[i][j] - magic7[i][j]);
            }
        }
        int minSum = sum[0];
        for (int tempSum : sum) {
            if (minSum > tempSum) {
                minSum = tempSum;
            }
        }

        return minSum;
    }
}
