package com.jk.algorithm.hackerrank.problem.catsAndAMouse;
/*
두 고양이와 쥐 한 마리가 있다.
각 고양이는 동일하게 1칸씩 이동가능하며, 쥐는 움직이지 않는다.
주어지는 수는 int x, y, z 이며 각각 고양이 A, 고양이 B, 쥐 의 현재 위치를 나타낸다.
고양이 A가 먼저 쥐를 잡으면 Cat A
고양이 B가 먼저 쥐를 잡으면 Cat B
두 고양이가 동시에 도착 시 고양이끼리 싸우므로 그 사이에 쥐는 도망갈 수 있다. 고로 Mouse C
를 각각 출력하라.

최초에 query 수가 주어지며 이후 주어지는 query 수 만큼 숫자 x, y, z 가 주어진다.
x = cat A / y = cat B / z = mouse C

두 수의 차를 이용한 비교.
 */