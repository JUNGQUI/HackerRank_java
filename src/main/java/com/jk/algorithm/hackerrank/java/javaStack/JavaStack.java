package com.jk.algorithm.hackerrank.java.javaStack;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public void solution () {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
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
                        if (!checkStack(tempStack.pop(), tempString)) {
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
        }
        sc.close();
    }

    private static boolean checkStack(String checkSum, String needCheck) {
        return "[".equals(needCheck) && "]".equals(checkSum)
                || "{".equals(needCheck) && "}".equals(checkSum)
                || "(".equals(needCheck) && ")".equals(checkSum);
    }
}
