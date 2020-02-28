package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        int i = 21, j = 23, k = 6;

        int result = 0;

        for (int a = 0; a <= j-i; a++) {
            char[] f = String.valueOf(i+a).toCharArray();
            StringBuilder tempS = new StringBuilder();
            for (int b = f.length-1; b >= 0; b--) {
                tempS.append(f[b]);
            }

            String s = tempS.toString();

            int tempResult = Math.abs((i+a) - Integer.parseInt(s));

            if (tempResult%k == 0) {
                result++;
            }
        }
//        return result;

        System.out.println("J Tag");
    }
}
