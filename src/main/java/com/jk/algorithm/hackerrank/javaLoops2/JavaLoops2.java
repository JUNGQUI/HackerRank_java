package com.jk.algorithm.hackerrank.javaLoops2;

import java.util.*;
import java.io.*;

public class JavaLoops2 {

    public void solution () {
        // hacker rank solution
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        System.out.println();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j=0; j<n; j++) {
                int fact = 0;
                for (int k=0; k<j+1; k++) {
                    fact += Math.pow(2, k);
                }
                fact *= b;
                System.out.print(a + fact + " ");
            }

            System.out.println();
        }
        in.close();
    }
}
