package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    @Test
    public void contextLoads() {
        int n = 8;
        String s = "UDDDUDUU";

        int currentLevel = 0;
        int countingValley = 0;

        for (char c : s.toCharArray()) {
            if ('U' == c) {
                currentLevel++;
            } else {
                currentLevel--;
            }

            if (currentLevel == 0 && 'U' == c) {
                countingValley++;
            }
        }

        System.out.println("J Tag");
    }
}
