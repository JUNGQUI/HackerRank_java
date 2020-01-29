package com.jk.algorithm.hackerrank.problem.designerPDFViewer;

import java.util.HashMap;

public class DesignerPDFViewer {
    public int designerPdfViewer(int[] h, String word) {
        HashMap<Character, Integer> dictionary = new HashMap<>();

        dictionary.put('a', 0);
        dictionary.put('b', 1);
        dictionary.put('c', 2);
        dictionary.put('d', 3);
        dictionary.put('e', 4);
        dictionary.put('f', 5);
        dictionary.put('g', 6);
        dictionary.put('h', 7);
        dictionary.put('i', 8);
        dictionary.put('j', 9);
        dictionary.put('k', 10);
        dictionary.put('l', 11);
        dictionary.put('m', 12);
        dictionary.put('n', 13);
        dictionary.put('o', 14);
        dictionary.put('p', 15);
        dictionary.put('q', 16);
        dictionary.put('r', 17);
        dictionary.put('s', 18);
        dictionary.put('t', 19);
        dictionary.put('u', 20);
        dictionary.put('v', 21);
        dictionary.put('w', 22);
        dictionary.put('x', 23);
        dictionary.put('y', 24);
        dictionary.put('z', 25);

        int max = 0;

        for (char tempWord : word.toCharArray()) {
            max = Math.max(max, h[dictionary.get(tempWord)]);
        }

        return word.length()*max;
    }
}
