package com.jk.algorithm.hackerrank.problem.queensArrack2;

public class QueensAttack2 {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int fullCondition = (n-1) * 2 +
                (r_q >= c_q ? c_q-1 : r_q-1) +
                (n - r_q >= c_q - 1 ? c_q - 1 : n - r_q) +
                (n - r_q >= n - c_q ? n - c_q : n - r_q) +
                (r_q - 1 >= n - c_q ? n - c_q : r_q - 1);

        int obstaclesCount = 0;

        int tlObstacle = 0;
        int trObstacle = 0;
        int blObstacle = 0;
        int brObstacle = 0;

        for (int [] temp : obstacles) {
            int r_t = temp[0];
            int c_t = temp[1];

            int rCondition = r_t - r_q;
            int cCondition = c_t - c_q;

            if (r_t == r_q) {
                // 가로
                obstaclesCount += c_t > c_q ? n - c_t : c_t;
            } else if (c_t == c_q) {
                // 세로
                obstaclesCount += r_t > r_q ? n - r_t : r_t;
            } else if (Math.abs(rCondition) == Math.abs(cCondition)) {
                int tempObstacle = 0;
                if (rCondition > 0 && cCondition > 0) {
                    tempObstacle = n - r_t > n - c_t ? n - c_t + 1 : n - r_t + 1;
                    trObstacle = trObstacle < tempObstacle ? tempObstacle : trObstacle;
                } else if (rCondition > 0 && cCondition < 0) {
                    tempObstacle = n - r_t > c_t ? c_t : n - r_t + 1;
                    tlObstacle = tlObstacle < tempObstacle ? tempObstacle : tlObstacle;
                } else if (rCondition < 0 && cCondition > 0) {
                    tempObstacle = r_t > n - c_t ? n - c_t + 1 : r_t;
                    brObstacle = brObstacle < tempObstacle ? tempObstacle : brObstacle;
                } else if (rCondition < 0 && cCondition < 0) {
                    tempObstacle = r_t > c_t ? c_t : r_t;
                    blObstacle = blObstacle < tempObstacle ? tempObstacle : blObstacle;
                }
            }
        }

        return fullCondition - obstaclesCount -
                trObstacle - tlObstacle - brObstacle - blObstacle;
    }
}
