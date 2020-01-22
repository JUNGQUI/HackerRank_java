package com.jk.algorithm.hackerrank.problem.electronicsShop;

/*
Monica 는 keyboard 와 USB 를 자신이 좋아하는 shop 에서 구매하려 한다. 그녀는 2개의 item 을 구매할 때 까지 shopping 을 한다.
keyboard 와 usb driver 의 가격 list, 그리고 그녀의 예산이 주어지면 그녀가 얼마의 금액을 소비하는지 출력하라.
단, 그녀가 충분한 예산을 가지고 있지 않다면 -1을 출력하라.

ex)
b=60
keyboards = [40, 50, 60]
drives = [5, 8, 12]

2개의 item 을 무조건 구매하기 때문에 (cross 해서, 키보드만 2개, usb 두 개는 불가능) 60을 넘지 않는 조합 중 최대의 값은
40 + 12 : 52
50 + 8 : 58
이다.
여기에서 58이 가장 많이 소비하는 금액이기 때문에 58을 출력한다.



이중 for 이용, 모든 값들에 대해 cross-add 후 가장 큰 값만 살려서 출력한다.
 */