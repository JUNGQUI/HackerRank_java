package com.jk.algorithm.hackerrank.problem.sockMerchant;

import java.util.Arrays;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pair = 0;
        int[] tempArray = Arrays.copyOf(ar, ar.length);
        int[] uniques = Arrays.stream(ar).distinct().toArray();


        for (int unique : uniques) {
            int sameValue = 0;

            for (int i = 0; i < tempArray.length; i++) {
                if (tempArray[i] != 0) {
                    if (unique == tempArray[i]) {
                        sameValue++;
                        tempArray[i] = 0;
                    }
                }
            }
            pair += sameValue/2;
        }

        return pair;
    }
}
