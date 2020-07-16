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

        // 배열 수
        int n = 100;
        // 장애물 수
        int k = 100;
        int [][] obstacles = new int[][] {
                {54, 87},
                {64, 97},
                {42, 75},
                {32, 65},
                {42, 87},
                {32, 97},
                {54, 75},
                {64, 65},
                {48, 87},
                {48, 75},
                {54, 81},
                {42, 81},
                {45, 17},
                {14, 24},
                {35, 15},
                {95, 64},
                {63, 87},
                {25, 72},
                {71, 38},
                {96, 97},
                {16, 30},
                {60, 34},
                {31, 67},
                {26, 82},
                {20, 93},
                {81, 38},
                {51, 94},
                {75, 41},
                {79, 84},
                {79, 65},
                {76, 80},
                {52, 87},
                {81, 54},
                {89, 52},
                {20, 31},
                {10, 41},
                {32, 73},
                {83, 98},
                {87, 61},
                {82, 52},
                {80, 64},
                {82, 46},
                {49, 21},
                {73, 86},
                {37, 70},
                {43, 12},
                {94, 28},
                {10, 93},
                {52, 25},
                {50, 61},
                {52, 68},
                {52, 23},
                {60, 91},
                {79, 17},
                {93, 82},
                {12, 18},
                {75, 64},
                {69, 69},
                {94, 74},
                {61, 61},
                {46, 57},
                {67, 45},
                {96, 64},
                {83, 89},
                {58, 87},
                {76, 53},
                {79, 21},
                {94, 70},
                {16, 10},
                {50, 82},
                {92, 20},
                {40, 51},
                {49, 28},
                {51, 82},
                {35, 16},
                {15, 86},
                {78, 89},
                {41, 98},
                {70, 46},
                {79, 79},
                {24, 40},
                {91, 13},
                {59, 73},
                {35, 32},
                {40, 31},
                {14, 31},
                {71, 35},
                {96, 18},
                {27, 39},
                {28, 38},
                {41, 36},
                {31, 63},
                {52, 48},
                {81, 25},
                {49, 90},
                {32, 65},
                {25, 45},
                {63, 94},
                {89, 50},
                {43, 41}
        };

        int r_q = 48;
        int c_q = 81;

        int q_t = n-r_q, q_r = n - c_q, q_b = r_q - 1, q_l = c_q - 1;
        int q_tr = Math.min(q_t, q_r), q_br = Math.min(q_r, q_b), q_bl = Math.min(q_l, q_b), q_tl = Math.min(q_l, q_t);

        int o_t = 0, o_tr = 0, o_r = 0, o_br = 0, o_b = 0, o_bl = 0, o_l = 0, o_tl = 0;

        for (int [] obstacle : obstacles) {
            boolean rFlag = obstacle[0] == r_q;
            boolean cFlag = obstacle[1] == c_q;

            if (rFlag || cFlag) {
                if (rFlag) {
                    if (c_q > obstacle[1]) {
                        o_l = Math.max(o_l, obstacle[1]);
                    } else {
                        o_r = Math.max(o_r, n-obstacle[1] + 1);
                    }
                } else {
                    if (r_q > obstacle[0]) {
                        o_b = Math.max(o_b, obstacle[0]);
                    } else {
                        o_t = Math.max(o_t, n-obstacle[0] + 1);
                    }
                }
            } else {
                if (obstacle[0] - obstacle[1] == r_q - c_q) {
                    // 우상향 대각선
                    if (r_q > obstacle[0]) {
                        o_bl = Math.max(o_bl, Math.min(obstacle[0], obstacle[1]));
                    } else {
                        o_tr = Math.max(o_tr, Math.min(n-obstacle[0], n-obstacle[1]) + 1);
                    }
                } else if (obstacle[0] + obstacle[1] == r_q + c_q) {
                    // 우하향 대각선
                    if (r_q > obstacle[0]) {
                        o_tl = Math.max(o_tl, Math.min(obstacle[0], n-obstacle[1]+1));
                    } else {
                        o_br = Math.max(o_br, Math.min(n-obstacle[0]+1, obstacle[1]));
                    }
                }
            }
        }

        int result = q_t + q_r + q_b + q_l + q_tr + q_br + q_bl + q_tl - o_t - o_tr - o_r - o_br - o_b - o_bl - o_l - o_tl;

        System.out.println("J tag");
    }
}



