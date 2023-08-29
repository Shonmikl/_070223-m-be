package org.example;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        boolean s = list.add(2);

        Set<Integer> set = new HashSet<>();
        boolean a1 = set.add(4);
        boolean a2 = set.add(41);
        boolean a3 = set.add(41);
        System.out.println(a1 + "||" + a2 + "||" + a3);
    }
}
