package com.jk.algorithm.hackerrank.problem.formingAMagicSquare;

/*
magic square : n x n 으로 이루어진 정사각형이며, 1부터 n^2 값까지 distinct 하게 주어진다. 동시에 어떤 column 에서든 가로, 세로, 대각선 의 합은 항상 동일해야 한다.
= 마방진

여기에선 n의 값이 3으로 고정되며, 이에 따라 1~9 까지의 값이 distinct 하게 위치해야 한다.
cost 는 해당 값과 올바르게 작동하게 바꾼 값의 차를 뜻한다.
ex) 554 일 경우 5를 6으로 바꾼다면, cost 는 1이다.

각 line 에서 cost 를 계산하여 최소한의 값을 합쳐서 마지막에 출력하라.

확인해보니 마방진을 만드는 공식이 있는데, 마방진의 공식으로 만드는 것 보다 (무엇보다 일정 차수 이상의 마방진은 공식이 먹히지 않는다고 함) 3이라는 차수가 한정되어 있기 때문에
가능한 모든 성분으로 일일이 비교하는 것이 overhead 가 더 적다.

 */