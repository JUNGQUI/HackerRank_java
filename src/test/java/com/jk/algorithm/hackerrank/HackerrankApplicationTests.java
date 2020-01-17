package com.jk.algorithm.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HackerrankApplicationTests {

//    Pattern pattern = Pattern.compile("\\d{1,2}");

    static class Player {
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

    static class Checker implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            if (o2.score == o1.score) {
                return o1.name.compareTo(o2.name);
            } else {
                return o2.score - o1.score;
            }
        }
    }

    @Test
    public void contextLoads() {
        Player[] players = new Player[4];
        Player a = new Player("a", 1);
        Player b = new Player("b", 2);
        Player c = new Player("c", 1);
        Player d = new Player("d", 4);

        players[0] = a;
        players[1] = b;
        players[2] = c;
        players[3] = d;
        Checker checker = new Checker();

        Arrays.sort(players, checker);

        System.out.println("J tag");
    }
}
