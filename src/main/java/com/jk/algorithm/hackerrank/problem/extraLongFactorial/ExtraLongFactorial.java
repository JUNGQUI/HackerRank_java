package com.jk.algorithm.hackerrank.problem.extraLongFactorial;

import java.math.BigInteger;

public class ExtraLongFactorial {
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;

        for (; n > 0; n--) {
            result = result.multiply(BigInteger.valueOf(n));
        }

        System.out.println(result);
    }
}
