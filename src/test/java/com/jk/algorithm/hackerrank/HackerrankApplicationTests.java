package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        String s = "y";
        String t = "yu";
        int k = 2;
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

        s = s.replaceAll(sameString.toString(), "");
        t = t.replaceAll(sameString.toString(), "");

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

        System.out.println("J Tag");
    }

    private int search (int[] array, int search) {
        int idx = 1;

        for (int temp : array) {
            if (temp == search) {
                break;
            } else {
                idx++;
            }
        }

        return idx;
    }
}


