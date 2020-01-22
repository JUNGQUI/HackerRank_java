package com.jk.algorithm.hackerrank.problem.catsAndAMouse;

public class CatsAndAMouse {
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int cA = Math.abs(x-z);
        int cB = Math.abs(y-z);

        if (cA > cB) {
            return "Cat B";
        } else if (cA < cB) {
            return "Cat A";
        } else {
            return "Mouse C";
        }
    }
}
