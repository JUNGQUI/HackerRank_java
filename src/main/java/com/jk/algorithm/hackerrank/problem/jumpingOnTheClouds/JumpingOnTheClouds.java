package com.jk.algorithm.hackerrank.problem.jumpingOnTheClouds;

public class JumpingOnTheClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int result = 0, i = 0, n = c.length;
        result++;
        i = (i+k)%n;

        if (c[i] == 1) {
            result += 2;
        }

        while(i != 0) {
            result++;
            i = (i+k)%n;

            if (c[i] == 1) {
                result += 2;
            }
        }

        return 100-result;
    }
}
