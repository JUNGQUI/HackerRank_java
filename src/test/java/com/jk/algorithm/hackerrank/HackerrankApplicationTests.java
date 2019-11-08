package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    @Test
    public void contextLoads() {
        int n = 5;
        int[] intList = new int[n];

        intList[0] = 1;
        intList[1] = -2;
        intList[2] = 4;
        intList[3] = -5;
        intList[4] = 1;

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int sum = 0;
                for (int k = 0; k < i + 1; k++) {
                    sum += intList[j+k];
                }
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println("J Tag");
    }
}
