package com.jk.algorithm.hackerrank.problem.nonDivisibleSubSet;

import java.util.HashMap;
import java.util.List;

public class NonDivisibleSubSet {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int result = 0;
        HashMap hashMap = new HashMap();

        for (Integer temp : s) {
            temp = temp%k;
            if (hashMap.containsKey(temp)) {
                hashMap.put(temp, (int)(hashMap.get(temp))+1);
            } else {
                hashMap.put(temp, 1);
            }
        }
        boolean flag = false;
        int limit = 0;
        if (k%2 == 0) {
            limit = k/2;
            flag = true;
        } else {
            limit = k/2+1;
        }

        for (int i = 1; i < limit; i++) {
            int reversIndex = Math.abs(i-k);

            if (hashMap.containsKey(i) && hashMap.containsKey(reversIndex)) {
                result += Math.max((int) hashMap.get(i), (int) hashMap.get(reversIndex));
            } else {
                if (hashMap.containsKey(i)) {
                    result += (int) hashMap.get(i);
                } else if (hashMap.containsKey(reversIndex)) {
                    result += (int) hashMap.get(reversIndex);
                }
            }
        }

        if (hashMap.containsKey(0)) {
            result++;
        }

        if (hashMap.containsKey(limit) && flag) {
            result++;
        }

        return result;
    }
}
