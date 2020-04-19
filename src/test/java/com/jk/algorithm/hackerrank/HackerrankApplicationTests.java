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
        int [] arr = new int[]{5, 4, 4, 2, 2, 8};
        int [] temp = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(temp);

        int[] result = new int[temp.length];

        for (int index = 0; index < temp.length; index++) {
            int unique = temp[index];
            int tempResult = 0;
            for (int arrObj : arr) {
                if (arrObj - unique >= 0) {
                    tempResult++;
                }
            }
            result[index] = tempResult;
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


