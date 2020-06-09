package com.jk.algorithm.hackerrank.problem.encryption;

/*
전달 받는 string 을 독특한 방식으로 encryption 을 해서 return 하라

받은 string s 에서 띄어쓰기는 모두 제거한 상태에서 s.length 를 root 를 씌워서 내림값과 올림값을 구한다.

내림값 <= row <= column <= 올림값 의 형태로 s를 나눈다.

1. i am groot
2. iamgroot (8자)
3.
iam
gro
ot

3번의 상태에서 세로로 읽어서 새로운 문자열을 만든다.
4. igo art mo

단, row * column 이 s.length 보다 크거나 같아야 한다.
위의 예시는 2(row) * 3(column) 은 만족하나  2*3=6<8(s.length) 이므로 row 를 하나 더 증가시킨 3 by 3 으로 진행한다.
단, 조건이 만족하는 경우가 여러 경우일 때는 가장 작은 area를 가지는 값으로 encryption 진행한다.


가장 작은 값이 전제조건이기 때문에 초기에 row 만으로 곱을 구한다. (row <= column)
그렇게 진행하고, 최대값 이전까지 진행하면서 row를 하나씩, column 을 하나씩 증가시키는 방법으로 최소값을 구한다.
이후 구해진 값으로 이중for문을 돌려 값을 뽑아내어 result 를 완성한다.
 */