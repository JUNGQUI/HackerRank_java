package com.jk.algorithm.hackerrank.problem.sequenceEquation;

public class SequenceEquation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            result[i] = search(p, search(p, i+1));
        }

        return result;
    }

    static int search (int[] array, int search) {
        int idx = 1;

        for (int temp : array) {
            if (temp == search) {
                break;
            } else {
                idx++;
            }
        }

        return idx;
    }
}
