package com.jk.algorithm.hackerrank.problem.organizingContainersOfBalls;

import java.util.Arrays;

public class OrganizingContainerOfBalls {
    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
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

        return result;
    }
}
