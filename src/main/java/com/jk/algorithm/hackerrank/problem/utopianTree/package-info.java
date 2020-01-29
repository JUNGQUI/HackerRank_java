package com.jk.algorithm.hackerrank.problem.utopianTree;

/*
Laura 는 Utopian tree 1m 짜리를 봄에 심기로 했다.
Utopian tree 는 봄에 2배로, 여름에는 1m 씩 자라난다.
총 n 번의 cycle 동안 자라난 Utopian tree 의 길이를 구하라.

첫 cycle 의 봄을 겪기 때문에 처음에 2배로, 이후 다음 cycle 은 여름, 다시 다음 cycle 은 봄이다.
그렇다면 for 문으로 구성할 시 짝수일 때 봄, 홀수일 때 여름이기 때문에 각 반복 변수를 구분자로 계산하면 된다.
 */