package com.jk.algorithm.hackerrank.problem.viralAdvertising;

public class ViralAdvertising {

    public int viralAdvertising (int n) {
        int shared = 5;
        int like, cumulative = 0;

        for (int i = 0; i < n; i++) {
            like = shared/2;
            shared = like * 3;
            cumulative += like;
        }

        return cumulative;
    }
}
