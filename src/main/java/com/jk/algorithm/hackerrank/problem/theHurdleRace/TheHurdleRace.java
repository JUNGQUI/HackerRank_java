package com.jk.algorithm.hackerrank.problem.theHurdleRace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheHurdleRace {

    public int hurdleRace(int k, int[] height) {
        List<Integer> heightList = new ArrayList<>();

        for (int columnHeight : height) {
            heightList.add(columnHeight);
        }

        Collections.sort(heightList);

        return Math.max((heightList.get(heightList.size() - 1) - k), 0);
    }
}
