package com.jk.algorithm.hackerrank.problem.pickingNumbers;

/*
하나의 List<Integer> 가 주어진다. 각 요소별로 차이가 1 혹은 0 (즉, 같은 값) 으로 이루어진 sub array 를 만든다고 할 때
이 중 sub array length 가 가장 큰 값이 얼마인지 출력하라.

모든 값을 unique 하게 변경 하고 2중 for 를 돌리면서 unique 한 값이 최소값인 것으로 하여 차를 구하고 차의 결과가 0, 1 일 때만 길이를 늘린다.
이후 늘린 길이를 기존의 길이들과 비교한다.
 */