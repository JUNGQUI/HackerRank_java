package com.jk.algorithm.hackerrank.tagContentExtractor;

/*
  tag 를 각 pair 에 맞게 찾아낸 후 tag 안의 내용을 1줄씩 출력하는 문제. 단, tag 의 pair 가 맞지 않을 경우 None 을 출력
  regex 에서 \1 이란 pattern 내에서 첫번째 인식했던 문자열 pattern 을 가져온다.
  ex) a\\1 == aa, abc\\1 == abcabc, <h1></\\1> == <h1><\h1>
  => \\가 두개 인 것은 IDE 내에서 해당 내역을 \(백슬래시) 를 표기 할때 문자로써 표현하게 하기 위함
 */