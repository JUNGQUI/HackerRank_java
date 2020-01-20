package com.jk.algorithm.hackerrank.problem.sockMerchant;

/*
양말 상점

양말 짝 맞게 맞추고 짝이 맞는 개수를 구하라.

양말의 개수 n이 주어지고. 양말 1짝의 색을 숫자로 표현하여 숫자 배열 ar[i]가 주어진다.

조건
1 <= n <= 100;
0 <= i < n;

중복 값을 제거하여 unique 한 비교 값을 구성하고 각 cycle 마다 비교 값이 총 몇 개인지 세고, 반으로 나누면 pair 가 완성된다.
해당 pair 를 cycle 마다 누적하여 return
 */