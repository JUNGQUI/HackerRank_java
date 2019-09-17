package com.jk.algorithm.hackerrank.stringIntroduce;


public class StringIntroduce {

    public void solution() {
        String A = "java";
        String B = "hello";

        // write code here
        System.out.println(A.length() + B.length());
        System.out.println((int)A.charAt(0) > (int)B.charAt(0) ? "Yes" : "No");
        System.out.println(
                A.substring(0, 1).toUpperCase()
                        + A.substring(1)
                        + " "
                        + B.substring(0,1).toUpperCase()
                        + B.substring(1)
        );
    }
}
