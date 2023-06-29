package org.example._2023_06_29;

import java.util.ArrayList;
import java.util.List;

public class ListList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);

        List<Integer> l2 = new ArrayList<>();
        l1.add(3);
        l1.add(4);

        List<Integer> l3 = new ArrayList<>();
        l1.add(5);
        l1.add(6);

        List<Integer> l4 = new ArrayList<>();
        l1.add(7);
        l1.add(8);

        List<List<Integer>> fin = new ArrayList<>();
        fin.add(l1);
        fin.add(l2);
        fin.add(l3);
        fin.add(l4);
    }
}
