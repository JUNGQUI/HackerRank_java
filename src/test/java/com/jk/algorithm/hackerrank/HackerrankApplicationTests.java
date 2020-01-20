package com.jk.algorithm.hackerrank;

import jdk.nashorn.internal.ir.LiteralNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    @Test
    public void contextLoads() {
        int pair = 0;

        int[] ar = new int[7];
        ar[0] = 10;
        ar[1] = 10;
        ar[2] = 10;
        ar[3] = 10;
        ar[4] = 20;
        ar[5] = 20;
        ar[6] = 50;

        int[] tempArray = Arrays.copyOf(ar, ar.length);
        int[] uniques = Arrays.stream(ar).distinct().toArray();


        for (int unique : uniques) {
            int sameValue = 0;

            for (int i = 0; i < tempArray.length; i++) {
                if (tempArray[i] != 0) {
                    if (unique == tempArray[i]) {
                        sameValue++;
                        tempArray[i] = 0;
                    }
                }
            }
            pair += sameValue/2;
        }

        System.out.println("J Tag");
    }
}
