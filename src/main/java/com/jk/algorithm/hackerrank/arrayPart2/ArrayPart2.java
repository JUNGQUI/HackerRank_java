package com.jk.algorithm.hackerrank.arrayPart2;

public class ArrayPart2 {
    public boolean solution(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        if (game == null) {
            return false;
        }

        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // Base Cases
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1; // marks as visited

        // Recursive Cases (Tries +m first to try to finish game quickly)
        return isSolvable(leap, game, i + leap)
                || isSolvable(leap, game, i + 1)
                || isSolvable(leap, game, i - 1);
    }
}
