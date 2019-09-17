package com.jk.algorithm.hackerrank.stringReverse;

import java.util.Scanner;

public class StringReverse {
    public void Solution () {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder();
        sb.append(A);

        if (sb.reverse().toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
