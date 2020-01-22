package com.jk.algorithm.hackerrank.problem.drawingBook;

/*
그림책이 1권 존재하는데, 이 책에서 전체 page n과 목표 page 인 p 가 주어진다.
각 page 는 왼쪽이 0을 제외한 짝수, 오른쪽이 1부터 시작하는 홀수 로 이루어져 있다.

Brie 는 1page 를 넘길 때 1장씩만 넘기며, 0에서 목표 page 로 이동하는 횟수와 끝에서 목표 page 로 이동하는 숫자 중
더 작은 값 (해당 page 로 빠르게 갈 수 있는) 을 출력하라.

전체 page 는 1 ~ 10^5 이며 목표 page 는 1 ~ n 까지 있다.


항상 (0은 존재하지 않지만) 0/1 | 2/3 | 4/5 .. 와 같이 pair 로 이루어져 있으므로
목표 page 와 전체 page 를 1장으로 간략화 해서 횟수만 알아내어 비교 후 더 작은 값을 출력

 */