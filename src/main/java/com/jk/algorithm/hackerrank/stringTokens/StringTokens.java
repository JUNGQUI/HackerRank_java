package com.jk.algorithm.hackerrank.stringTokens;

import java.util.*;

public class StringTokens {
    public void solution () {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        // Write your code here.
//        scan.close();

        String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";

        s = s.replaceAll("!", " ")
                .replaceAll("\\?", " ")
                .replaceAll("'", " ")
                .replaceAll("@", " ")
                .replaceAll("\\.", " ")
                .replaceAll(",", " ")
                .replaceAll("_", " ");

        String[] splitedString = s.split(" ");
        List<String> temp = new ArrayList<>(Arrays.asList(splitedString));

        while(temp.contains("")) {
            temp.remove("");
        }

        System.out.println(temp.size());
        for (String result : temp) {
            System.out.println(result);
        }
    }
}
