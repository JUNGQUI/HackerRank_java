package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        int k = 7;
        List<Integer> s = new ArrayList<>();
        int[] tempArray = new int[]{278,576,496,727,410,124,338,149,209,702,282,718,771,575,436};
        List<Integer> result = new ArrayList<>();

        for (int temp : tempArray) {
            s.add(temp);
        }

        for (int i = 0; i < s.size()-1; i++) {
            for (int j = i+1; j < s.size(); j++) {
                if ((s.get(i) + s.get(j)) % k != 0) {
                    if (!result.contains(s.get(i))) {
                        result.add(s.get(i));
                    }

                    if (!result.contains(s.get(j))) {
                        result.add(s.get(j));
                    }
                }
            }
        }

        System.out.println("J Tag");
    }

    private int search (int[] array, int search) {
        int idx = 1;

        for (int temp : array) {
            if (temp == search) {
                break;
            } else {
                idx++;
            }
        }

        return idx;
    }
}


