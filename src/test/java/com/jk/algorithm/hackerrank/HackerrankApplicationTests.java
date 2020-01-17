package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    @Test
    public void contextLoads() {
        int arrayNumber = 5;
        List<String> array = new ArrayList<>(
                Arrays.asList(("12 0 1 78 12").split(" "))
        );

        int queryNumber = 2;

        ArrayList<String> queryArray = new ArrayList<>();
        queryArray.add("Insert");
        queryArray.add("5 23");
        queryArray.add("Delete");
        queryArray.add("0");

        for (int i = 0; i < queryNumber; i++) {
            String query = queryArray.get(i);
            String condition = queryArray.get(i+1);

            if ("Insert".equals(query)) {
                String[] conditions = condition.split(" ");
                array.add(Integer.parseInt(conditions[0]), conditions[1]);
            } else if ("Delete".equals(query)) {
                array.remove(Integer.parseInt(condition));
            }
        }

        for (String write : array) {
            System.out.print(write + " ");
        }

        System.out.println("J tag");
    }
}
