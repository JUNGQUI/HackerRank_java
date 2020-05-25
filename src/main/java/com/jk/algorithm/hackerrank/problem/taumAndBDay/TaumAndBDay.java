package com.jk.algorithm.hackerrank.problem.taumAndBDay;

public class TaumAndBDay {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        Long result = 0L;

        long lb = (long)b;
        long lw = (long)w;
        long lbc = (long)bc;
        long lwc = (long)wc;
        long lz = (long)z;

        if (lbc <= lwc) {
            if (lbc + lz < lwc) {
                result = ((lb * lbc) + (lw * (lbc + lz)));
            } else {
                result = lb*lbc + lw*lwc;
            }
        } else {
            if (lwc + lz < lbc) {
                result = ((lw * lwc) + (lb * (lwc + lz)));
            } else {
                result = lb*lbc + lw*lwc;
            }
        }

        return result;
    }
}
