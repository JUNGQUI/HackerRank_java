package com.jk.algorithm.hackerrank.problem.appendAndDelete;

/*
string s 와 string t 가 주어지고, 2가지의 action만 가능하다.
1. 뒤에서부터 덧붙이기
2. 뒤에서부터 삭제하기

그리고 int k 가 주어지는데 s를 t로 변경하는데 횟수가 k 와 정확히 일치하면 Yes, 아니면 No 를 출력한다.
또한 delete의 경우 비어있는 값에도 delete가 가능하다.

case가 4가지이다.

1. 기본적으로 변환해야 할 개수가 k보다 높을 경우 : No
2. s.length() 짝수, t.length() 짝수, k 짝수 || 홀수 홀수 홀수 일 경우 : Yes
3. s를 모두 삭제하고 t로 변경 시 남은 수가 k 보다 작을경우 : Yes -> 비어 있는 값에 대해 delete 연산이 가능하기 때문에 가능
4. 이외의 경우 : No

무엇이든 남아 있는 (변환해야할) 개수를 구해야 하기 때문에 공통인 부분들을 추출하고 해당 값으로 실제로 변환하지 않고 연산만 진행하면 된다.
 */