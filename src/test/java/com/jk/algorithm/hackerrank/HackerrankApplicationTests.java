package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        String w = "ab";
        char[] charsw = w.toCharArray();
        String result = "";
        int checkPoint = 0;

        for (int i = charsw.length; i > 0; i--) {
            int fCompare = charsw[i-1];
            int bCompare = charsw[i];

            if (fCompare >= bCompare) {
                if (i-1 == 0) {
                    result = "no answer";
                    break;
                }
            } else {
                checkPoint = i-1;
            }
        }

        char[] tempChars = w.substring(checkPoint).toCharArray();



        System.out.println("J tag");
    }
}



