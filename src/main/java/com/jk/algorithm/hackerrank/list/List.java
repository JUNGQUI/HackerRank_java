package com.jk.algorithm.hackerrank.list;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public void solution() {
        Scanner scanner = new Scanner(System.in);

        int numberOfArray = scanner.nextInt();
        ArrayList<Integer> arrayInt = new ArrayList<>();

        for (int i = 0; i < numberOfArray; i++) {
            arrayInt.add(scanner.nextInt());
        }

        int numberOfQuery = scanner.nextInt();

        for (int j = 0; j < numberOfQuery; j++) {
            String query = scanner.next();

            if ("Insert".equals(query)) {
                int index = scanner.nextInt();
                int column = scanner.nextInt();

                arrayInt.add(index, column);
            } else if ("Delete".equals(query)) {
                int index = scanner.nextInt();

                arrayInt.remove(index);
            }
        }
        scanner.close();

        for (int write : arrayInt) {
            System.out.print(write + " ");
        }
    }
}