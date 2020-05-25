package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {

        int [][] ar = new int[][] {
                {100, 100, 10000, 10000, 0},
                {100, 100, 0, 1000000, 0},
                {100, 100, 0, 0, 0}
        };

        for (int[] temp : ar) {
            System.out.println(this.cal(temp[0], temp[1], temp[2], temp[3], temp[4]));
        }

        System.out.println("J Tag");
    }

    private Long cal (int b, int w, int bc, int wc, int z) {
        Long result = 0L;

        long lb = (long)b;
        long lw = (long)w;
        long lbc = (long)bc;
        long lwc = (long)wc;
        long lz = (long)z;

        if (lbc <= lwc) {
            if (lbc + lz < lwc) {
                result = ((lb * lbc) + (lw * (lbc + lz)));
            } else {
                result = lb*lbc + lw*lwc;
            }
        } else {
            if (lwc + lz < lbc) {
                result = ((lw * lwc) + (lb * (lwc + lz)));
            } else {
                result = lb*lbc + lw*lwc;
            }
        }

        return result;
    }
}



