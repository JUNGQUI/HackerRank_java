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
        int n = 6;
        int p = 5;

        int startPage = 1;
        int endPage = n/2 + 1;
        int targetPage = p/2 + 1;

//        int fromStartPage = p/2;
//        int fromEndPage = (n-p)/2;

        int fromStartPage = targetPage - startPage;
        int fromEndPage = endPage - targetPage;

        if (fromStartPage <= fromEndPage) {
            System.out.println(fromStartPage);
        } else {
            System.out.println(fromEndPage);
        }

        System.out.println("J Tag");
    }
}
