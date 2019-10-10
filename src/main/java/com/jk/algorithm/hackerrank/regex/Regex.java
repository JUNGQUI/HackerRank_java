package com.jk.algorithm.hackerrank.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    private String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    // 0이나 1로 시작하면서 0~9 까지 숫자 중 한자리 혹은 두자리  (000~199)
    // 2로 시작하면서 0~4 사이 한자리이면서 0~9사이 한자리 (200~249)
    // 25로 시작하면서 0~5사이 한자리 (250~255)
    // 중 하나의 조건만 맞으면 match result true
    String pattern = num + "." +  num + "." +  num + "." + num;
}


