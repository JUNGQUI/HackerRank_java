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
        int[] height = new int[] {1, 6, 3, 5, 2};
        int k = 4;
        List<Integer> heightList = new ArrayList<>();

        for (int columnHeight : height) {
            heightList.add(columnHeight);
        }

        Collections.sort(heightList);
        System.out.println(heightList.get(heightList.size()-1) - k);

        System.out.println("J Tag");
    }
}
