package com.jk.algorithm.hackerrank.problem.climbingTheLeaderBoard;

/*
점수판과 alice 의 점수가 제공됩니다. 점수의 순위는 Dense Ranking 의 rule 을 따른다.

Dense Ranking : 동일 점수일 경우 동일 rank 로 두고 다음 점수는 그 다음 rank 로 계산한다.

각 점수의 rank 를 구해 alice 의 rank 배열을 완성하여 return 하라.

Dense ranking 이기 때문에 모든 값의 중복을 제거하여 set으로 구성하면 복잡도를 줄일 수 있다.
그 후에 각 값을 비교하는 logic 을 구성하면 된다.

2중 for를 통해 만들 수 있으나 그렇게 할 경우 O(n^2) 의 복잡도가 중간에 추가되기 때문에한 timeout 이 발생한다.

따라서 O(nLogn) 의 복잡도를 가진 이진 탐색 트리 중 red-black tree 를 사용했다.

해당 방식으로 풀이 https://duzi077.tistory.com/159
 */