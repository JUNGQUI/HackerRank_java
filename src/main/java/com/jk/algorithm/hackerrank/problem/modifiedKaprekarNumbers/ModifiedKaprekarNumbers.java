package com.jk.algorithm.hackerrank.problem.modifiedKaprekarNumbers;

public class ModifiedKaprekarNumbers {
    static void kaprekarNumbersV1(int p, int q) {
        StringBuilder result = new StringBuilder();

        int[] kaprekarNumber = new int[]
                {1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050,
                        7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999};

        for (int kkn : kaprekarNumber) {
            if (kkn >= p && kkn <= q) {
                result.append(kkn).append(" ");
            }
        }

        if ("".equals(result.toString())) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(result);
        }
    }

    static void kaprekarNumberV2(int p, int q) {
        StringBuilder result = new StringBuilder();

        for (int i = p; i <= q; i++) {
            int temp = i*i;
            int d = String.valueOf(i).length();
            int r = 0, l = 0;

            if ((temp + "").length() == 2*d) {
                r = Integer.parseInt(String.valueOf(temp).substring(0, d));
                l = Integer.parseInt(String.valueOf(temp).substring(d));
            } else if ((temp + "").length() == (2*d)-1) {
                r = Integer.parseInt(String.valueOf(temp).substring(0, d-1));
                l = Integer.parseInt(String.valueOf(temp).substring(d-1));
            }

            if (r == 0 || l == 0) {
                continue;
            }

            result.append(r + l == i ? (r + l) + " " : "");
        }

        if (result.length() == 0) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(result.toString());
        }
    }
}
