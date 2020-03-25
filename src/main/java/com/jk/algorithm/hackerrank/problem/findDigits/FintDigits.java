package com.jk.algorithm.hackerrank.problem.findDigits;

public class FintDigits {
    // Complete the findDigits function below.
    static int findDigits(int n) {
        int result = 0;
        String parse = String.valueOf(n);

        for (int i = 0; i < parse.length(); i++) {
            int temp = Integer.parseInt(parse.substring(i, i+1));

            if (temp != 0 && n%temp == 0) {
                result++;
            }
        }

        return result;
    }
}
