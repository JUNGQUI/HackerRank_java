package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    @Test
    public void contextLoads() {
        int readNumberCount = 5;

        ArrayList<ArrayList<Integer>> fullArray = new ArrayList<>();

        for (int i = 0; i < readNumberCount; i++) {
            ArrayList<String> tempArray = new ArrayList<>(Arrays.asList("5 41 77 74 22 44".split(" ")));
            ArrayList<Integer> semiArray = new ArrayList<>();

            for (int j = 1; j < tempArray.size(); j++) {
                semiArray.add(Integer.parseInt(tempArray.get(j)));
            }

            fullArray.add(semiArray);
        }

        int queryLimit = 5;

        for (int a = 0; a < queryLimit; a++) {
            ArrayList<String> queryArray = new ArrayList<>();
            queryArray = new ArrayList<>(Arrays.asList("1 3".split(" ")));

            int arrayNumber = Integer.parseInt(queryArray.get(0));
            int columnNumber = Integer.parseInt(queryArray.get(1));

            ArrayList<Integer> tempArray = fullArray.get(arrayNumber-1);

            if (tempArray.size() == 0 || tempArray.size() < columnNumber) {
                System.out.println("ERROR!");
            } else {
                System.out.println(tempArray.get(columnNumber-1));
            }
        }

        System.out.println("J Tag");
    }
}
