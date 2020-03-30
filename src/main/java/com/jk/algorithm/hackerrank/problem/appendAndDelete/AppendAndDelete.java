package com.jk.algorithm.hackerrank.problem.appendAndDelete;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        String result = "";
        StringBuilder sameString = new StringBuilder();
        boolean flag = false;

        if (s.equals(t)) {
            result = "Yes";
        }

        for (int i = 0; i < s.length(); i++) {
            if (i < t.length()) {
                if (charS[i] == charT[i] && !flag) {
                    sameString.append(charS[i]);
                } else {
                    flag = true;
                }
            } else {
                break;
            }
        }

        int commonLength = sameString.toString().length();

        if((s.length()+t.length()-2*commonLength)>k){
            result = "No";
        } else if((s.length()+t.length()-2*commonLength)%2==k%2){
            result = "Yes";
        } else if((s.length()+t.length()-k)<0){
            result = "Yes";
        } else{
            result = "No";
        }

        return result;
    }
}
