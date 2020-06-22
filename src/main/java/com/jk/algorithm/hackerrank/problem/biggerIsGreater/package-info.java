package com.jk.algorithm.hackerrank.problem.biggerIsGreater;

/*
주어지는 String s 를 Lexicographical order 에서 desc로 맞게 해당 값보다 큰 정렬의 값 중 가장 작은 값을 return 하여라.

ex) String s = "ab"; -> return "ba";
a, b 에서 a 가 더 앞순이기 때문에 b 와 a 를 바꿔서 return 해주면 주어진 조건에 만족한다.
String s = "lmno"; -> return "lmon";
lmno 를 바꾸게 된다면 다양한 case 가 생긴다.

l - 1
m - 2
n - 3
o - 4

로 가정 할 경우 가능한 case 는 아래와 같다.

lmon, lomn, lonm, olmn, olnm, omln, omnl, onlm, onml...
1243, 1423, 1432, 4123, 4132, 4312, 4321, 4213, 4231...
단, 이 중 가장 작은 문자열은 lmon 이다.

l 은 가장 작기 때문에 어떠한 값으로 대체되어도 기존 lmno(1234) 보단 크기 때문에 여러 경우의 수가 생기지만,
1234 -> 1243 이 가장 작기 때문에 lmon 이 정답이다.

원리는 각 문자를 숫자화, 이후 자릿수를 생각해가며 변화를 주되 변할 수 있는 가장 작은 값을 정답으로 줘야 하기 때문에
뒤에서부터 숫자를 세가며 가장 작은 값으로 변하는 그 값을 pivot 으로 잡고
뒤에서부터 변화 시 해당 값보다 가장 근사하게 큰 값을 (자릿수 포함이기 때문에 처음으로 발견되는 pivot 보다 큰 수) 바꿔준다.

pivot 이후부터 끝까지의 문자열을 사전적 정렬 (가장 작아야 하기 때문) 를 해주고 0~pivot + 정렬된 string 을 붙여서 정답을 도출하면 된다.

단, 정답이 없을 경우 no answer 를 return 한다.

 */