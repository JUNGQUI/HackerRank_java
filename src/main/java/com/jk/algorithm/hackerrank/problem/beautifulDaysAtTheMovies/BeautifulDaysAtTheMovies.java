package com.jk.algorithm.hackerrank.problem.beautifulDaysAtTheMovies;

import java.util.Stack;

public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int result = 0;

        for (int a = 0; a <= j-i; a++) {
            char[] f = String.valueOf(i+a).toCharArray();
            StringBuilder tempS = new StringBuilder();
            for (int b = f.length-1; b >= 0; b--) {
                tempS.append(f[b]);
            }

            String s = tempS.toString();

            int tempResult = Math.abs((i+a) - Integer.parseInt(s));

            if (tempResult%k == 0) {
                result++;
            }
        }
        return result;
    }
}
