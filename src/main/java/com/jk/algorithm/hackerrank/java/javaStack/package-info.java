package com.jk.algorithm.hackerrank.java.javaStack;

/*
Stack 을 구성하라
각 쌍이 맞으며, 순서 또한 맞는지 틀린지를 구현하라

ex)
[]{} O
[{}] O
[{]} X
[]{}( X
[]}{ X

말 그대로 LIFO 를 구현하면 된다.
들어오는 값은 괄호로 한정한다.

2가지 방법이 있다.
1 : regex pattern 을 이용하여, 전체에서 [], {}, () pattern 이 matching 되는 모든 것들을 타노스한다.
이후 남아 있다면 false, 남아있지 않다면 balanced 하기 때문에 true
= 사실상 stack 을 이용한 것이 아닌 편법이라 생각된다. 그러나 빨리 풀기만 하면 장땡이지.

2. stack 의 pop 을 이용해서 전체를 읽을 때 분기로 관리, 이후 conditions 에 맞게 true false 출력
위 예제는 2번 방법을 사용. 1번은 hackerrank discussions 에 있다.
 */