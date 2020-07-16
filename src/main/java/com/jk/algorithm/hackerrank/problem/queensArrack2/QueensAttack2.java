package com.jk.algorithm.hackerrank.problem.queensArrack2;

public class QueensAttack2 {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int q_t = n-r_q, q_r = n - c_q, q_b = r_q - 1, q_l = c_q - 1;
        int q_tr = Math.min(q_t, n - c_q), q_br = Math.min(q_r, q_b), q_bl = Math.min(q_l, q_b), q_tl = Math.min(q_l, q_t);

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

        return q_t + q_r + q_b + q_l + q_tr + q_br + q_bl + q_tl - o_t - o_tr - o_r - o_br - o_b - o_bl - o_l - o_tl;
    }
}
