package com.jk.algorithm.hackerrank.hashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashMap {
    public void solution () {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        Set<String> result = new HashSet<>();
        for (int j = 0; j < t; j++) {
            String temp = pair_left[j] + " " + pair_right[j];
            result.add(temp);
            System.out.println(result.size());
        }
    }
}
