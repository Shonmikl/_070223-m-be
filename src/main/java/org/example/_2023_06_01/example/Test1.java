package org.example._2023_06_01.example;

public class Test1 {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Vadim", 10);
        Pupil p2 = new Pupil("Lera", 9);

        TeenAge t1 = new TeenAge("Vladislav", 14);
        TeenAge t2 = new TeenAge("Dima", 15);

        Adult a1 = new Adult("Dmitry", 29);
        Adult a2 = new Adult("Paul", 30);

        Team<Pupil> pupilTeam1 = new Team<>("PT1");
        pupilTeam1.addParticipant(p1);
        pupilTeam1.addParticipant(p2);

        Team<TeenAge> teenAgeTeam1 = new Team<>("TT1");
        teenAgeTeam1.addParticipant(t1);
        teenAgeTeam1.addParticipant(t2);

        Team<Adult> adultTeam1 = new Team<>("AT1");
        adultTeam1.addParticipant(a1);
        adultTeam1.addParticipant(a2);
    }
}
