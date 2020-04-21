package com.jk.algorithm.hackerrank.problem.repeatedString;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int aSize = 0;
        for (char temp : s.toCharArray()) {
            if ('a' == temp) {
                aSize++;
            }
        }

        long result = aSize * (n/s.length());
        for (int i = 0; i < n%s.length(); i++) {
            char temp = s.charAt(i);
            if ('a' == temp) {
                result++;
            }
        }

        return result;
    }
}
