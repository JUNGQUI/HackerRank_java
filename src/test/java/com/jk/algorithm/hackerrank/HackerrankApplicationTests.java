package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        int x = 1;
        int y = 3;
        int z = 2;

        int cA = Math.abs(x-z);
        int cB = Math.abs(y-z);

        if (cA > cB) {
            System.out.println("Cat B");
        } else if (cA < cB) {
            System.out.println("Cat A");
        } else {
            System.out.println("Mouse C");
        }

        System.out.println("J Tag");
    }

}
