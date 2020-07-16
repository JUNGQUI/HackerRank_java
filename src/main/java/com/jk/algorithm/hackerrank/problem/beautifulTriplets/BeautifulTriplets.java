package com.jk.algorithm.hackerrank.problem.beautifulTriplets;

public class BeautifulTriplets {
    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int prev = arr[i];
            int arrCount = 1;

            for (int j = i+1; j < arr.length; j++) {
                if (prev + d == arr[j]) {
                    arrCount++;
                    prev = arr[j];
                    if (arrCount == 3) {
                        result++;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
