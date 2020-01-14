package com.jk.algorithm.hackerrank.arrayPart2;

/*
Java 1D Array (Part2) 문제

index 0에서 n개의 element 를 가진 배열 game 이 존재한다.
i 에서부터 시작하며, 아래의 규칙을 따른다.

i-1 이 있고, 해당 값이 0이면 i-1로 이동
i+1 이 0이면 i+1로 이동
i+leap 가 0이면 i+leap 로 점프
n-1에 있거나 i+leap >= n 이면 배열의 끝으로 이동하고 game 에서 승리

배열 바깥의 수로 이동하는 순간 승리하며, 0을 가지고 있어야 이동하기 쉽다.
 */