package com.jk.algorithm.hackerrank.java.tagContentExtractor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public void solution() {
        List<String> testList = new ArrayList<>();
        int testCases = 4;
        int get = 0;

        testList.add("<h1>Nayeem loves counseling</h1>");
        testList.add("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
        testList.add("<Amee>safat codes like a ninja</amee>");
        testList.add("<SA premium>Imtiaz has a secret crush</SA premium>");

        while(testCases>0){
            String line = testList.get(get);

            //Write your code here
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = pattern.matcher(line);

            boolean flag = false;

            while (m.find()) {
                System.out.println(m.group(2));
                flag = true;
            }

            if (!flag) {
                System.out.println("None");
            }

            testCases--;
            get++;
        }
    }
}
