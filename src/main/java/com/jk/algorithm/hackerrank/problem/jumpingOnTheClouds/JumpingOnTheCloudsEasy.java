package com.jk.algorithm.hackerrank.problem.jumpingOnTheClouds;

public class JumpingOnTheCloudsEasy {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int currentIndex = 0;
        int jumpResult = 0;

        for (int i = 0; i < c.length; i++) {
            if (currentIndex == c.length-1) {
                break;
            }
            if (currentIndex + 2 < c.length) {
                if (c[currentIndex+2] == 0) {
                    currentIndex += 2;
                    jumpResult++;
                    continue;
                }
            }

            if (currentIndex + 1 < c.length) {
                if (c[currentIndex+1] == 0) {
                    currentIndex += 1;
                    jumpResult++;
                }
            }
        }

        return jumpResult;
    }
}
