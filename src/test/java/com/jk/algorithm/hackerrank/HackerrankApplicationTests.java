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
        int[] kaprekarNumber = new int[]
                {1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050,
                        7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999};
        StringBuilder result = new StringBuilder();
        StringBuilder mResult = new StringBuilder();

        int p = 1000, q = 10000;

        for (int i = p; i <= q; i++) {
            int temp = i*i;
            int d = String.valueOf(i).length();
            int r = 0, l = 0;

            if ((temp + "").length() == 2*d) {
                r = Integer.parseInt(String.valueOf(temp).substring(0, d));
                l = Integer.parseInt(String.valueOf(temp).substring(d));
            } else if ((temp + "").length() == (2*d)-1) {
                r = Integer.parseInt(String.valueOf(temp).substring(0, d-1));
                l = Integer.parseInt(String.valueOf(temp).substring(d-1));
            }

            if (r == 0 || l == 0) {
                continue;
            }

            mResult.append(r + l == i ? (r + l) + " " : "");
        }

        for (int kkn : kaprekarNumber) {
            if (kkn >= p && kkn <= q) {
                result.append(kkn).append(" ");
            }
        }

        if ("".equals(result.toString())) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(result);
        }

        System.out.println("J tag");
    }
}



