package com.jk.algorithm.hackerrank.java.subArray;

import java.util.Scanner;

public class SubArray {
    public void solution () {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] list = new int[n];
        int subArrayCount = 0;

        for (int a = 0; a < n; a++) {
            list[a] = scanner.nextInt();
        }

        scanner.close();

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int sum = 0;
                for (int k = 0; k < i + 1; k++) {
                    sum += list[j+k];
                }
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
