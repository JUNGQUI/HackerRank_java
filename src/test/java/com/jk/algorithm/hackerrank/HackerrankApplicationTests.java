package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(3);
        a.add(3);
        a.add(1);
        List<Integer> uniqueSet = new ArrayList<>(new LinkedHashSet<>(a));

        int result = 0;

        for (Integer value : uniqueSet) {
            int length = 0;

            for (Integer integer : a) {
                if (integer - value >= 0 && integer - value <= 1) {
                    length++;
                }
            }

            if (result < length) {
                result = length;
            }
        }

        System.out.println("J Tag");
    }
}
