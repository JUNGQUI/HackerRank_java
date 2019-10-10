package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

    @Test
    public void contextLoads() {
        Pattern pattern = Pattern.compile("\\d{1,2}");

        System.out.println("J tag");
    }

}
