package com.jk.algorithm.hackerrank.java.primality;

import java.math.BigInteger;

public class Primality {
    public void solution() {
        String n = "10";

        BigInteger result = new BigInteger(n);

        if (result.isProbablePrime(10)) {
            System.out.print("prime");
        } else {
            System.out.print("not prime");
        }
    }
}
