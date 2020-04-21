package com.jk.algorithm.hackerrank.problem.repeatedString;

/*
Lilah 는 string s 와 long n 을 가지고 있다.
long n 만큼 string s 의 character 1자 1자를 반복해서 String 을 만들고, 그 안에 'a'가 몇 개 있는지 찾아라.
s는 영어로, 소문자로만 구성되어 있다.

s안에 a가 몇 개 있는지 확인하고 (temp1) n을 s의 length 만큼 나누어 몫(temp2) 과 나머지(temp3) 를 구한다.
이후 temp2와 temp1 을 곱하고 을(temp4) s안에 temp3 만큼의 substring 중 a가 몇개 있는지를 구한 뒤(temp5)
temp4와 5를 더하면 된다.
 */