package com.jk.algorithm.hackerrank.problem.encryption;

public class Encryption {
    // Complete the encryption function below.
    static String encryption(String s) {
        StringBuilder result = new StringBuilder();
        s = s.replaceAll(" ", "");

        int row = (int) Math.floor(Math.sqrt(s.length()));
        int high = (int) Math.ceil(Math.sqrt(s.length()));

        int column = s.length() > row * row ? row + 1 : row;

        for (int i = 0; i < high; i++) {
            if (row*column < s.length()) {
                row++;
            } else {
                if (row < column) {
                    row++;
                }
                break;
            }

            if (row * column < s.length()) {
                column++;
            } else {
                break;
            }
        }

        for (int a = 0; a < row; a++) {
            for (int b = 0; b < column; b++) {
                int temp = (b*column) + a;
                result.append(temp >= s.length() ? "" : s.substring(temp, temp + 1));
            }
            if (a + 1 != row) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
