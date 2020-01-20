package com.jk.algorithm.hackerrank.JavaComparator;

/*
이름 - 점수 로 pair 된 값을 받고 Comparator 를 상속 받아 custom 하게 sorting 하라.
sorting 방법은 점수를 우선순위로 두되, 점수가 동일 할 경우 이름을 alphabet 순으로 정렬하라.

compare 사용법
- 음수 또는 0이면 두 자리가 유지, 양수일 경우에만 들어온 data 가 뒤바뀐다.

STRING1.compareTo(STRING2) 사용법
- STRING1 == STRING2 : 0
- STRING1 < STRING2 : -N
- STRING1 > STRING2 : +N

ex) a == a : 0 / a < b : -1 / b > a : +1

점수가 같을 때를 제외하면 점수에 의해 DESC 하게 정렬되어야 하며,의 점수가 같을 경우 이름 순으로 (asc, 가나다순) 정렬되어야 한다.
compare 가 구현되는 방식은 들어온 순서대로 비교 시 양수 일 경우 서로의 자리를 바꾸기 때문에 뒤에 들어온 Player 의 점수가 높을 경우 바꾸고, 아닐 경우 바꾸지 않으면 된다.

따라서 두 player score 가 같을 경우만 compareTo 를 통해서 이름 순으로 정렬 후 나머지 case 의 경우엔 두 수의 차를 return 한다.
 */