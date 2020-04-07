package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        int d1 = 2, m1 = 7, y1 = 1014, d2 = 1, m2 = 1, y2 = 1014;

        int fee;

        if (y2 > y1 ||
                (y2 == y1 && m2 > m1) ||
                (y2 == y1 && m2 == m1 && d2 >= d1)) {
            fee = 0;
        } else if (y1 == y2) {
            if (m1 == m2) {
                fee = (d1 - d2) * 15;
            } else {
                int day = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, y2);
                calendar.set(Calendar.MONTH, d2-1);
                day += calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

                for (int i = d2+1; i < d1; i++) {
                    calendar.set(Calendar.MONTH, i-1);
                    day += calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                }

                day += d1 - d2;
                fee = day * 500;
            }
        } else {
            fee = 10000;
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


