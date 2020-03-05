package com.jk.algorithm.hackerrank.problem.circularArrayRotation;

/*
왓슨 박사는 배열 내에서 한번의 조작으로 첫 요소가 마지막 요소로, 나머지 요소들이 차례로 앞으로 당겨지는 right circular rotation 을 알고 있다.
셜록에게는 위와 같은 원리를 알려주고 몇 번의 조작을 거친 후 배열의 상태를 알아내는 test 를 진행한다.

배열 a, 조작 횟수 k, 알아내야 할 index 배열 queries 가 주어진다.
조작 이후 index queries 에 맞게 값을 만들어서 반환하라.

각 항목들의 이동 후 idx 를 배열로 재구성하고 전체 idx 배열에서 해당 하는 값이 맞는지 확인 후 맞다면 idx를 찾아낸 그 위치의 input 배열을 반환한다.
 */