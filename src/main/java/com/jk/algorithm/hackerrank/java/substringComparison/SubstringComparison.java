package com.jk.algorithm.hackerrank.java.substringComparison;

public class SubstringComparison {
    public String solution (String s, int k) {
        s = "welcometojava";
        k = 3;
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int stringLength = (s.length() - k);
        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 0; i < stringLength; i++) {
            String str = s.substring(i,k+i);

            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }

        return smallest + "\n" + largest;
    }
}
