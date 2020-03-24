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
        int[] c = new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;
        int result = 0, i = 0, n = c.length;

        result++;
        i = (i+k)%n;

        if (c[i] == 1) {
            result += 2;
        }

        while((i+k)%n != 0) {
            result++;
            i = (i+k)%n;

            if (c[i] == 1) {
                result += 2;
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


