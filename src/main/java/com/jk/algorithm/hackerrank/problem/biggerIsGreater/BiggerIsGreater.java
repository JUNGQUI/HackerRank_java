package com.jk.algorithm.hackerrank.problem.biggerIsGreater;

import java.util.Arrays;

public class BiggerIsGreater {
    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        String result = "";
        int pivot = -1;
        int changeIDX = -1;

        for (int i = w.length()-1; i > 0; i--) {
            int before = w.charAt(i);
            int after = w.charAt(i-1);

            if (before > after) {
                pivot = i-1;
                break;
            }
        }

        if (pivot == -1) {
            return "no answer";
        }

        int compair = w.charAt(pivot);

        for (int i = w.length()-1; i > pivot; i--) {
            int temp = w.charAt(i);

            if (temp > compair) {
                changeIDX = i;
                break;
            }
        }

        if (changeIDX != -1) {
            char[] ws = w.toCharArray();
            char temp = ws[pivot];
            ws[pivot] = ws[changeIDX];
            ws[changeIDX] = temp;
            char[] needSort = Arrays.copyOfRange(ws, pivot+1, ws.length);
            Arrays.sort(needSort);
            char[] prefix = Arrays.copyOf(ws, pivot+1);

            result += new String(prefix) + new String(needSort);
        } else {
            result = "no answer";
        }

        return result;
    }
}
