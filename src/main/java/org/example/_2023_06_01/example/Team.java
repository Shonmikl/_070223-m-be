package org.example._2023_06_01.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// у КЛАССА есть ПОЛЯ
public class Team<X extends Participant> {
    //T == Adult
    //x = 5
    private String name;
    private List<X> list = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(X participant) {
        list.add(participant);
    }

    //Team t1 = new Team()
    //Team t2 = new Team()
    //t1.playWith(t2)
    public void playWith(Team<X> team) {
        String winner;
        Random random = new Random();
        int ri = random.nextInt(2);
        if(ri == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }

        System.out.println(winner);
    }
}
