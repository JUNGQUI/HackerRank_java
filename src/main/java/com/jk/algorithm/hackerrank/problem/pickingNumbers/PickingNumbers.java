package com.jk.algorithm.hackerrank.problem.pickingNumbers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PickingNumbers {
    public int solution (List<Integer> a) {
        List<Integer> uniqueSet = new ArrayList<>(new LinkedHashSet<>(a));

        int result = 0;

        for (Integer value : uniqueSet) {
            int length = 0;

            for (Integer integer : a) {
                if (integer - value >= 0 && integer - value <= 1) {
                    length++;
                }
            }

            if (result < length) {
                result = length;
            }
        }

        return result;
    }
}
