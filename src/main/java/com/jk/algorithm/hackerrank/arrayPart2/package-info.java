package com.jk.algorithm.hackerrank.arrayPart2;

/*
Java 1D Array (Part2) 문제

index 0에서 n개의 element 를 가진 배열 game 이 존재한다.
0 에서부터 시작하며, 아래의 규칙을 따른다.

i-1 이 있고, 해당 값이 0이면 i-1로 이동
i+1 이 0이면 i+1로 이동
i+leap 가 0이면 i+leap 로 점프
n-1에 있거나 i+leap >= n 이면 배열의 끝으로 이동했기 때문에 game 에서 승리

이동 시 규칙은 항상 목적지에 가깝게 가는 수를 선택한다.

leap 와 game 이 주어지고 이길 수 있으면 true, 아니면 false 출력

배열 바깥의 수로 이동하는 순간 승리하며, 0을 가지고 있어야 이동하기 쉽다.


몹시 쪼개고 이후에 해당 함수를 recursive 하게 호출하게 구현

순수 if로 구현 해보기 (이해가 안되서..)
이후 다른 함수로 구현해보기

주요 골자는 최소한의 process 단위로 잘라내야 한다.
여기서 최소한의 process 단위는 index가 범위 값을 넘어가는가 의 문제이다.
 */