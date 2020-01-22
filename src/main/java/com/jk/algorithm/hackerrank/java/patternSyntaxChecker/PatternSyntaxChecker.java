package com.jk.algorithm.hackerrank.java.patternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public void solution () {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern checkPattern = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(Exception ex) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
