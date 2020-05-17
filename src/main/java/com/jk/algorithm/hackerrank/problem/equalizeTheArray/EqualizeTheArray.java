package com.jk.algorithm.hackerrank.problem.equalizeTheArray;

import java.util.HashMap;

public class EqualizeTheArray {
    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (Integer i : arr) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        int maxVal = 0;

        for (Integer j : hashMap.values()) {
            if (maxVal < j) {
                maxVal = j;
            }
        }

        return arr.length - maxVal;
    }
}
