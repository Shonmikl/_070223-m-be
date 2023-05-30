package org.example._2023_05_30;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SE {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();


        treeSet.add(null);
        treeSet.add(16);
        treeSet.add(25);
        treeSet.add(43);
        treeSet.add(34);
    }
}
