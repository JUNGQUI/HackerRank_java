package com.jk.algorithm.hackerrank.problem.climbingTheLeaderBoard;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingTheLeaderBoard {
    public int[] solution (int[] alice, int[] scores) {
        int[] aliceRanks = new int[alice.length];
        List<Integer> scoreList = Arrays.stream(scores).boxed().collect(Collectors.toList());
        Set<Integer> scoreSet = new HashSet<>(scoreList);

        scoreList = new ArrayList<>(scoreSet);

        Collections.sort(scoreList);
        Collections.reverse(scoreList);
        NavigableMap<Integer, Integer> scoreMap = new TreeMap<>();

        int i = 1;
        for (int score : scoreList) {
            scoreMap.put(score, i);
            i++;
        }

        for (int j = 0; j < alice.length; j++) {
            int aliceScore = alice[j];
            if (aliceScore >= scoreMap.lastEntry().getKey()) {
                aliceRanks[j] = scoreMap.lastEntry().getValue();
            } else {
                if (aliceScore == scoreMap.ceilingEntry(aliceScore).getKey()) {
                    aliceRanks[j] = scoreMap.ceilingEntry(aliceScore).getValue();
                } else {
                    aliceRanks[j] = scoreMap.ceilingEntry(aliceScore).getValue()+1;
                }
            }
        }

        return aliceRanks;
    }
}
