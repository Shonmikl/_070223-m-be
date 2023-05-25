package org.example._2023_05_25;

import java.awt.desktop.QuitStrategy;
import java.util.*;

public class CollEx1 {
    public static int sum(int a, int b) {
        return a + b;
    }

    private static void getSumPairs(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(20));
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == k) {
                    System.out.println(list.get(i) + " : " + list.get(j));
                }
            }
        }
    }


    private boolean isExist(int n, int k) {
        //
        //заполнить ЛЛ или АЛ рандомными числами n
        //есть ли в АЛ или ЛЛ k
        return false;
    }

    public static void main(String[] args) {
        ArrayList<QuitStrategy> list = new ArrayList<>();
        int result = sum(sum(5, 2), sum(9, sum(3, 8)));

//        for (int i = 0; i < 15; i++) {
//            list.add(new Random().nextInt(22));
//        }
//        System.out.println(list);
//
//        System.out.println(list.isEmpty());


    }
}

interface I {
    void get();
}
