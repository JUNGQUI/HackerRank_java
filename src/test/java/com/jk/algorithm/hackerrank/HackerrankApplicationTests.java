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
        int d = 3;
        int[] arr = new int[] {1, 2, 4, 5, 7, 8, 10};

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int prev = arr[i];
            int arrCount = 1;

            for (int j = i+1; j < arr.length; j++) {
                if (prev + d == arr[j]) {
                    arrCount++;
                    prev = arr[j];
                    if (arrCount == 3) {
                        result++;
                        break;
                    }
                }
            }
        }

        System.out.println("J tag");
    }
}



