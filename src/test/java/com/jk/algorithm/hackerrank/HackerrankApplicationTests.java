package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    @Test
    public void contextLoads() {
        String input = "[{]}";
//        String input = "[]{}";

        Stack<String> tempStack = new Stack<>();
        boolean tempFlag = false;

        for (int i = input.length()-1; i > -1; i--) {
            if (tempFlag) {
                break;
            }
            String tempString = input.substring(i, i+1);
            if ("{".equals(tempString)
                    || "(".equals(tempString)
                    || "[".equals(tempString)) {
                if (tempStack.size() > 0) {
                    if (!this.checkStack(tempStack.pop(), tempString)) {
                        System.out.println(false);
                        tempFlag = true;
                        break;
                    }
                } else {
                    System.out.println(false);
                    tempFlag = true;
                    break;
                }
            } else if ("}".equals(tempString)
                    || ")".equals(tempString)
                    || "]".equals(tempString)) {
                tempStack.push(tempString);
            }
        }

        if (!tempFlag) {
            if (tempStack.size() > 0) {
                System.out.println(false);
            } else {
                System.out.println(true);
            }
        }

        System.out.println("J tag");
    }

    private boolean checkStack(String checkSum, String needCheck) {
        return "[".equals(needCheck) && "]".equals(checkSum)
                || "{".equals(needCheck) && "}".equals(checkSum)
                || "(".equals(needCheck) && ")".equals(checkSum);
    }
}
