package com.jk.algorithm.hackerrank.problem.utopianTree;

public class UtopianTree {
    public int utopianTree(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                result *= 2;
            } else {
                result += 1;
            }
        }
        return result;
    }
}
