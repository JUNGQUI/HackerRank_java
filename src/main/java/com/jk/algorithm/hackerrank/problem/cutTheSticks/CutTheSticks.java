package com.jk.algorithm.hackerrank.problem.cutTheSticks;

import java.util.Arrays;

public class CutTheSticks {
    public int[] solution(int[] arr) {
        int [] temp = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(temp);

        int[] result = new int[temp.length];

        for (int index = 0; index < temp.length; index++) {
            int unique = temp[index];
            int tempResult = 0;
            for (int arrObj : arr) {
                if (arrObj - unique >= 0) {
                    tempResult++;
                }
            }
            result[index] = tempResult;
        }

        return result;
    }
}
