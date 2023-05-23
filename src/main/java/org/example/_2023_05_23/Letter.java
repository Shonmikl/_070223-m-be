package org.example._2023_05_23;

import java.util.Random;

public class Letter {
    String text;
    Header header;
    Link link;

    int get(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        int d = letter.get("lkjkjg");
        System.out.println(d);

    }
}

class Header {
    public double getAvgScore(int[] array) {
        return 0.0;
    }

}

class Link {

}