package com.jk.algorithm.hackerrank.problem.countingValleys;

public class CountingValley {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int currentLevel = 0;
        int countingValley = 0;

        for (char c : s.toCharArray()) {
            if ('U' == c) {
                currentLevel++;
            } else {
                currentLevel--;
            }

            if (currentLevel == 0 && 'U' == c) {
                countingValley++;
            }
        }

        return countingValley;
    }
}
