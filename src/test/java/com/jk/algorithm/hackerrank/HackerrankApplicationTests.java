package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
//        int[] scores = new int[] {100, 100, 50, 40, 40, 20, 10};
//        int[] alice = new int[] {5, 25, 50, 120};
        int[] scores = new int[] {100, 90, 90, 80, 75, 60};
        int[] alice = new int[] {50, 65, 77, 90, 102};

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

//        int index = 0;
//        int indexValue = -1;
//        int indexRank = 0;
//
//        for (int i = 0; i < alice.length; i++) {
//            int currentRank = 1;
//            int aliceRank = 0;
//
//            if (alice[i] == indexValue) {
//                aliceRank = indexRank;
//            } else {
//                if (alice[i] > indexValue) {
//                    index = 0;
//                }
//
//                for (int j = index; j < scoreList.size(); j++) {
//                    if (alice[i] >= scoreList.get(j)) {
//                        aliceRank = currentRank;
//                        index = j;
//                        indexRank = currentRank;
//                        indexValue = scoreList.get(j);
//                        break;
//                    } else {
//                        currentRank++;
//                    }
//                }
//
//                if (aliceRank == 0) {
//                    aliceRank = currentRank;
//                }
//            }
//
//            aliceRanks[i] = aliceRank;
//        }
//
        for (int aliceRank : aliceRanks) {
            System.out.println(aliceRank);
        }

        System.out.println("J Tag");
    }
}
