package com.jk.algorithm.hackerrank.problem.angryProfessor;

public class AngryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        String result = "";
        int count = 0;

        for (int temp : a) {
            if (temp <= 0) {
                count++;

                if (count >= k) {
                    break;
                }
            }
        }

        if (k <= count) {
            result = "NO";
        } else {
            result = "YES";
        }

        return result;
    }
}
