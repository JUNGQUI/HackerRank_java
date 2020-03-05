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
        int[] a = new int[]{1, 2, 3};
        int k = 2;
        int[] queries = new int[]{0, 1, 2};

        int rotation = k%a.length;
        int[] resultIDX = new int[a.length];
        int[] result = new int[queries.length];

        for (int i = 0; i < a.length; i++) {
            resultIDX[i] = i+rotation >= a.length ? i+rotation-a.length : i+rotation;
        }

        for (int x = 0; x < queries.length; x++) {
            int query = queries[x];
            for (int y = 0; y < resultIDX.length; y++) {
                int idx = resultIDX[y];
                if (query == idx) {
                    result[x] = a[y];
                    break;
                }
            }
        }

        System.out.println("J Tag");
    }
}


