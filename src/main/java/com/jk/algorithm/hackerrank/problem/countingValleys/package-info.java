package com.jk.algorithm.hackerrank.problem.countingValleys;

/*
0에서 시작해서 -로 이동 후 0에 도달할 때 까지 를 1개의 계곡으로 취급, 추후 돌아왔을 경우 계곡의 개수를 구하라.

마지막에 올라오면서 sealevel 이여야 valley 가 counting 되기 때문에 직전 up && currentLevel = 0 이면 valley 로 취급
 */