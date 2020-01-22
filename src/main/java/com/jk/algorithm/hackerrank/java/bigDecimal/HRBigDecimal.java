package com.jk.algorithm.hackerrank.java.bigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class HRBigDecimal {
    public void solution () {

        int n = 9;
        String[] s = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        Comparator<String> customComparator = (s1, s2) -> {
            BigDecimal a = new BigDecimal(s1);
            BigDecimal b = new BigDecimal(s2);
            return b.compareTo(a); // descending order
        };

        Arrays.sort(s, 0, n, customComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
