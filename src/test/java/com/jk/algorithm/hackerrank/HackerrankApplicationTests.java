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
        String w = "lmno";
        String result = "";

        int pivot = 0;

        for (int i = w.length()-1; i-1 >= 0; i--) {
            int f = w.charAt(i-1);
            int b = w.charAt(i);

            if (f < b) {
                pivot = i-1;
                break;
            } else {
                if (i == 1) {
                    pivot = -1;
                }
            }
        }

        if (pivot == -1) {
            System.out.println("no answer");
//            return "no answer";
        }

        String temp = w.substring(pivot);
        int pivotNumber = w.charAt(pivot);

        for (int j = temp.length()-1; j >= 0; j--) {
            if (pivotNumber < (int)temp.charAt(j)) {
                char[] chars = temp.toCharArray();

                if (pivot == 0) {
                    result = String.valueOf(chars[j]);
                } else {
                    result = w.substring(0, pivot) + chars[j];
                }

                chars[j] = w.charAt(pivot);
                Arrays.sort(chars);
                result += Arrays.toString(chars);
                break;
            }
        }

        System.out.println(result);

        System.out.println("J tag");
    }
}



