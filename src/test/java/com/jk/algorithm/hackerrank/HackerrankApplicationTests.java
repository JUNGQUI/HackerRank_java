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
        System.out.println(es(10, new int[] {3, 1}, new int[] {5, 2, 8}));
        System.out.println(es(5, new int[] {4}, new int[] {5}));

        System.out.println("J Tag");
    }

    private int es (int b, int[] key, int[] usb) {
        int result = -1;

        for (int tk : key) {
            for (int tu : usb) {
                if (result < tk + tu && tk + tu <= b) {
                    result = tk + tu;
                }
            }
        }

        return result;
    }
}
