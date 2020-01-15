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
        ArrayList<ArrayList<String>> query = new ArrayList<>();
        ArrayList<int[]> numbers = new ArrayList<>();

        query.add(new ArrayList<>(Arrays.asList("5 3".split(" "))));
        query.add(new ArrayList<>(Arrays.asList("6 5".split(" "))));
        query.add(new ArrayList<>(Arrays.asList("6 3".split(" "))));
        query.add(new ArrayList<>(Arrays.asList("3 1".split(" "))));

        numbers.add(new int[]{0, 0, 0, 0, 0});
        numbers.add(new int[]{0, 0, 0, 1, 1, 1});
        numbers.add(new int[]{0, 0, 1, 1, 1, 0});
        numbers.add(new int[]{0, 1, 0});

        for (int i = 0; i < 4; i++) {
            int arrayCount = Integer.parseInt(query.get(i).get(0));
            int leap = Integer.parseInt(query.get(i).get(1));

            int[] tempArray = numbers.get(i);
            int startIndex = 0;

            for (int j = 0; j < arrayCount; j++) {
                if (startIndex+leap >= arrayCount) {
                    System.out.println("true");
                    break;
                }

                if (tempArray[startIndex+leap] == 0) {
                    startIndex = startIndex+leap;
                    continue;
                }

                if (startIndex+1 >= arrayCount) {
                    System.out.println("true");
                    break;
                }

                if (tempArray[startIndex+1] == 0) {
                    startIndex++;
                    continue;
                }

                if (startIndex-1 > -1) {
                    if (tempArray[startIndex-1] == 0) {
                        startIndex--;
                    } else {
                        System.out.println("false");
                        break;
                    }
                } else {
                    System.out.println("false");
                    break;
                }
            }
        }

        System.out.println("WTF, false");

        System.out.println("J Tag");
    }
}
