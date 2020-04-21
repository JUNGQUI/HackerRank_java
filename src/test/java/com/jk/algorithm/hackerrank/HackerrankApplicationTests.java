package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        String s = "aba";
        long n = 10;

        int aSize = 0;
        for (char temp : s.toCharArray()) {
            if ('a' == temp) {
                aSize++;
            }
        }

        long result = aSize * (n/s.length());
        for (int i = 0; i < n%s.length(); i++) {
            char temp = s.charAt(i);
            if ('a' == temp) {
                result++;
            }
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


