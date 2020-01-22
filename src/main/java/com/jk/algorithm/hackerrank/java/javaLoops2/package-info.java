package com.jk.algorithm.hackerrank.java.javaLoops2;

// java loops 2 problem
/**
 * 입력은 t, a, b, n 으로 입력 받는데, t는 처음에 몇 번의 숫자 배열을 입력 받는지, a는 더할 1개의 값, b는 각 팩토리얼에 곱할 값, n은 2의 n제곱 만큼 더하는 팩토리얼의 개수이다.
 * ex)
 * 1
 * 0 2 10
 *
 * 일 경우 숫자의 배열은 1개, a 는 0, b는 2, n은 10이다. 즉,
 * ( a + b * (2^0) ), ( a + b * (2^0) + b * (2^1) ) ... ( a + b * 2^0 + b * 2^1 + ... + b * 2^n-1 ) 을 출력하게 해야 한다.
 */