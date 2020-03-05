package com.jk.algorithm.hackerrank.problem.circularArrayRotation;

public class CircularArrayRotation {
    // Complete the circularArrayRotation function below.
    public int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int rotation = k%a.length;
        int[] resultIDX = new int[a.length];
        int[] result = new int[queries.length];

        for (int i = 0; i < a.length; i++) {
            resultIDX[i] = i+rotation >= a.length ? i+rotation-a.length : i+rotation;
        }

        for (int x = 0; x < queries.length; x++) {
            int query = queries[x];
            for (int y = 0; y < resultIDX.length; y++) {
                int idx = resultIDX[y];
                if (query == idx) {
                    result[x] = a[y];
                    break;
                }
            }
        }

        return result;
    }
}
