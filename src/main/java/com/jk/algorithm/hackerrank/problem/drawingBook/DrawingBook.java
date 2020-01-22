package com.jk.algorithm.hackerrank.problem.drawingBook;

public class DrawingBook {
    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */

        int startPage = 1;
        int endPage = n/2 + 1;
        int targetPage = p/2 + 1;
        int fromStartPage = targetPage - startPage;
        int fromEndPage = endPage - targetPage;

        if (fromStartPage <= fromEndPage) {
            return fromStartPage;
        } else {
            return fromEndPage;
        }

//        return Math.min(fromStartPage, fromEndPage);
    }
}
