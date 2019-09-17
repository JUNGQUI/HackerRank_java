package com.jk.algorithm.hackerrank.anagrams;

public class Anagrams {

    public boolean solution(String a, String b) {

        boolean flag = true;

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            String comparison = a.substring(i, i+1);

            if (b.contains(comparison)) {
                b = b.replaceFirst(comparison, "");
            } else {
                flag = false;
            }
        }

        return flag;
    }
}
