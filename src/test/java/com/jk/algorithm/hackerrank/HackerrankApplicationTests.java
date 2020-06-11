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
        int [][] container = new int[][] {
                {0, 2, 1},
                {1, 1, 1},
                {2, 0, 0}
        };

        int length = container.length;
        int [] sumOfHorizon = new int[length];
        int [] sumOfVertical = new int[length];

        for (int i = 0; i < length; i++) {
            int SOH = 0;
            for (int j = 0; j < length; j++) {
                SOH += container[i][j];
                sumOfVertical[j] += container[i][j];
            }
            sumOfHorizon[i] = SOH;
        }

        Arrays.sort(sumOfHorizon);
        Arrays.sort(sumOfVertical);

        String result = "Possible";

        for (int a = 0; a < length; a++) {
            if (sumOfHorizon[a] != sumOfVertical[a]) {
                result = "Impossible";
                break;
            }
        }

        System.out.println("J tag");
    }
}



