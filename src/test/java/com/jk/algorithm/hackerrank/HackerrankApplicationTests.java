package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");
//    new int[] {3, 1};

    @Test
    public void contextLoads() {
        int k = 7;
        List<Integer> s = new ArrayList<>();
//        int[] tempArray = new int[]{1, 7, 2, 4};
        int[] tempArray = new int[]{278,576,496,727,410,124,338,149,209,702,282,718,771,575,436};
//        int[] tempArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int temp : tempArray) {
            temp = temp%k;
            s.add(temp);
        }

        int result = 0;
        HashMap hashMap = new HashMap();

        for (Integer temp : s) {
            temp = temp%k;
            if (hashMap.containsKey(temp)) {
                hashMap.put(temp, (int)(hashMap.get(temp))+1);
            } else {
                hashMap.put(temp, 1);
            }
        }
        boolean flag = false;
        int limit = 0;
        if (k%2 == 0) {
            limit = k/2;
            flag = true;
        } else {
            limit = k/2+1;
        }

        for (int i = 1; i < limit; i++) {
            int reversIndex = Math.abs(i-k);

            if (hashMap.containsKey(i) && hashMap.containsKey(reversIndex)) {
                result += Math.max((int) hashMap.get(i), (int) hashMap.get(reversIndex));
            } else {
                if (hashMap.containsKey(i)) {
                    result += (int) hashMap.get(i);
                } else if (hashMap.containsKey(reversIndex)) {
                    result += (int) hashMap.get(reversIndex);
                }
            }
        }

        if (hashMap.containsKey(0)) {
            result++;
        }

        if (hashMap.containsKey(limit) && flag) {
            result++;
        }

//        for (int i = 0; i < s.size()-1; i++) {
//            for (int j = i+1; j < s.size(); j++) {
//                if ((s.get(i) + s.get(j)) % k != 0) {
//                    if (!result.contains(s.get(i))) {
//                        result.add(s.get(i));
//                    }
//
//                    if (!result.contains(s.get(j))) {
//                        result.add(s.get(j));
//                    }
//                } else {
//                    result.remove(s.get(i));
//                    result.remove(s.get(j));
//                }
//            }
//        }

        System.out.println("J Tag");
    }

    private int search (int[] array, int search) {
        int idx = 1;

        for (int temp : array) {
            if (temp == search) {
                break;
            } else {
                idx++;
            }
        }

        return idx;
    }
}


