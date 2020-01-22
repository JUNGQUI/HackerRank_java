package com.jk.algorithm.hackerrank.java.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HRArrayList {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int readNumberCount = Integer.parseInt(scanner.nextLine());

        ArrayList<ArrayList<Integer>> fullArray = new ArrayList<>();

        for (int i = 0; i < readNumberCount; i++) {
            ArrayList<String> tempArray = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
            ArrayList<Integer> semiArray = new ArrayList<>();

            for (int j = 1; j < tempArray.size(); j++) {
                semiArray.add(Integer.parseInt(tempArray.get(j)));
            }

            fullArray.add(semiArray);
        }

        int queryLimit = Integer.parseInt(scanner.nextLine());

        for (int a = 0; a < queryLimit; a++) {
            ArrayList<String> queryArray = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

            int arrayNumber = Integer.parseInt(queryArray.get(0));
            int columnNumber = Integer.parseInt(queryArray.get(1));

            ArrayList<Integer> tempArray = fullArray.get(arrayNumber-1);

            if (tempArray.size() == 0 || tempArray.size() < columnNumber) {
                System.out.println("ERROR!");
            } else {
                System.out.println(tempArray.get(columnNumber-1));
            }
        }

        scanner.close();
    }
}
