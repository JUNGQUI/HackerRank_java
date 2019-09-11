package com.jk.algorithm.hackerrank.javaEndOfFile;

import java.util.Scanner;

public class JavaEndOfFile {

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int number = 0;

        while (flag) {
            number++;
            if(scanner.hasNext()) {
                System.out.println(number + " " + scanner.nextLine());
            } else {
                flag = false;
            }
        }
    }
}
