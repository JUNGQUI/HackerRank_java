package com.jk.algorithm.hackerrank.problem.sherlockAndSquares;

public class SherlockAndSquares {
    // Complete the squares function below.
    static int squares(int a, int b) {
        int result = ((int) Math.sqrt(b)) - ((int) Math.sqrt(a));

        if ((Math.sqrt(a) - (int) Math.sqrt(a)) == 0) {
            result++;
        }

        return result;
    }
}
