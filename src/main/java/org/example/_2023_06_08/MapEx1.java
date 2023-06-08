package org.example._2023_06_08;

import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Evk");
        map.put(25, "nu####ll");
        map.put(2223, "@@@");

        int a = 5;
        int b = a;

        System.out.println(2 << 1);

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(b);
            System.out.println("Key [" + m.getKey() + "] : Value [" + m.getValue() + "]");
        }

        int[] ae = {1, 2, 3, 4, 5};
        int d = 9;
        for (int i = 0; i < map.size(); i++) {

        }

        int count = 0;
        while (count != 10) {
            //......

            count++;
        }


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(22);
        set.add(32);
        set.add(244);

//        for (Integer in : set) {
//            System.out.println(in);
//        }
    }
}
