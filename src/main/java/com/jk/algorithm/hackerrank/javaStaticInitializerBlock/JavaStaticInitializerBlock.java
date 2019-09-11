package com.jk.algorithm.hackerrank.javaStaticInitializerBlock;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    private static Scanner scanner = new Scanner(System.in);

    private static int B = scanner.nextInt();
    private static int H = scanner.nextInt();
    private static boolean flag = B > 0 && H > 0;

    static {
        scanner.close();
        if (!flag) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if(flag) {
            int area = B*H;
            System.out.print(area);
        }
    }
}
