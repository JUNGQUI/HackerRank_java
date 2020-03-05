package com.jk.algorithm.hackerrank.problem.viralAdvertising;

/*
HackerLand Enterprise 는 새로운 마케팅 전략을 세웠다.
첫 날에는 5명에게 sns 를 통해 광고를 한다. 이중 절반이 좋아요를 누르고, 이 좋아요의 인원이 1명당 3명에게 추천한다.
n일 후 누적 좋아요 숫자를 구하라.

단, 좋아요의 경우 정수가 아니라면 버림을 취한다.

날   공유   좋아요   누적
Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24

n이 주어지고 n일 뒤의 누적수를 구하면 된다.

누적 += 좋아요
좋아요 = 공유/2
공유 = 전날좋아요*3

 */