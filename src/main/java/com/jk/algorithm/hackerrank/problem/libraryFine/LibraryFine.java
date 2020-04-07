package com.jk.algorithm.hackerrank.problem.libraryFine;

import java.util.Calendar;

public class LibraryFine {
    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fee;

        if (y2 > y1 ||
                (y2 == y1 && m2 > m1) ||
                (y2 == y1 && m2 == m1 && d2 >= d1)) {
            fee = 0;
        } else if (y1 == y2) {
            if (m1 == m2) {
                fee = (d1 - d2) * 15;
            } else {
                fee = (m1 - m2) * 500;
            }
        } else {
            fee = 10000;
        }

        return fee;
    }

//    아까워서 남김... 다른 개월일 경우에 일수 x 로 계산..
//    int fee;
//
//        if (y2 > y1 ||
//            (y2 == y1 && m2 > m1) ||
//            (y2 == y1 && m2 == m1 && d2 >= d1)) {
//        fee = 0;
//    } else if (y1 == y2) {
//        if (m1 == m2) {
//            fee = (d1 - d2) * 15;
//        } else {
//            int day = 0;
//            Calendar calendar = Calendar.getInstance();
//            calendar.set(Calendar.YEAR, y2);
//            calendar.set(Calendar.MONTH, d2-1);
//            day += calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//
//            for (int i = d2+1; i < d1; i++) {
//                calendar.set(Calendar.MONTH, i-1);
//                day += calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//            }
//
//            day += d1 - d2;
//            fee = day * 500;
//        }
//    } else {
//        fee = 10000;
//    }
}
