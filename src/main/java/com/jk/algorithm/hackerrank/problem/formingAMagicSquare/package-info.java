package com.jk.algorithm.hackerrank.problem.formingAMagicSquare;

/*
magic square : n x n 으로 이루어진 정사각형이며, 1부터 n^2 값까지 distinct 하게 주어진다. 동시에 어떤 column 에서든 가로, 세로, 대각선 의 합은 항상 동일해야 한다.
= 마방진

여기에선 n의 값이 3으로 고정되며, 이에 따라 1~9 까지의 값이 distinct 하게 위치해야 한다.
cost 는 해당 값과 올바르게 작동하게 바꾼 값의 차를 뜻한다.
ex) 554 일 경우 5를 6으로 바꾼다면, cost 는 1이다.

각 line 에서 cost 를 계산하여 최소한의 값을 합쳐서 마지막에 출력하라.

 */