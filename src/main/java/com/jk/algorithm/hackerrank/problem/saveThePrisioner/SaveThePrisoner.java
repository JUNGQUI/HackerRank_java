package com.jk.algorithm.hackerrank.problem.saveThePrisioner;

public class SaveThePrisoner {

    public int saveThePrisoner(int n, int m, int s) {
        int temp = m%n;
        int result = s + temp - 1;

        if (result > n) {
            result -= n;
        }

        if (result == 0) {
            result = n;
        }

        return result;
    }
}
