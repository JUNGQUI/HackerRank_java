package com.jk.algorithm.hackerrank.problem.countingValleys;

/*
Gary 는 산악인이다. 항상 1unit 만큼 움직이며 U일 경우 산으로, D일 경우 계곡으로 간다.
Gary 의 일지를 보고 얼마나 많은 계곡을 갔는지 출력하라.

P.S. : 계곡 counting 은 내려갔다가 seaLevel 로 복귀 시 1개의 계곡으로 취급한다.


0에서 시작해서 -로 이동 후 0에 도달할 때 까지 를 1개의 계곡으로 취급, 추후 돌아왔을 경우 계곡의 개수를 구하라.

마지막에 올라오면서 sealevel 이여야 valley 가 counting 되기 때문에 직전 up && currentLevel = 0 이면 valley 로 취급
 */