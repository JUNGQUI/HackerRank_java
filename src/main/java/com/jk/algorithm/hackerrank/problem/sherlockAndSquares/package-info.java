package com.jk.algorithm.hackerrank.problem.sherlockAndSquares;

/*
왓슨은 셜록의 수학적 능력에 대해 도전하는 것을 좋아한다. 어떤 값 두가지가 주어졌을 때 그 범위 안에서 square integer 값이 몇 개 인지 구하라.

square integer : 같은 수 제곱한 값
ex) 1x1 = 1 / 2x2 = 4 / 3x3 = 9 / 4x4 = 16 ...

범위를 제곱근으로 내린 후 내려가진 값 내에서 시작과 끝을 구하고 값의 차이를 구하면 범위 안에 square integer 를 얻을 수 있다.
단, 범위 시작 시 딱 맞아떨어지는 값이 시작값이라면 ++ 연산이 필요하다.
범위 끝의 값의 경우엔 항상 값을 포함하게 되고, 두 수의 차이는 항상 마지막 값까지 포함시킨 개수이기 때문에 마지막 값은 상관 없다.
 */