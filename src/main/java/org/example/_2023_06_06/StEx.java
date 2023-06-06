package org.example._2023_06_06;

import java.util.*;

public class StEx {
    public static void main(String[] args) {
        /**
         * int[] a;
         * ArrayList
         * String str = "mama";
         */
            //x = 5
        int[] a = {12, 3, 32, 1};
        int d = a.length;
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 10;
        }
                        //x = 5
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        int hh = list.size();
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i) * 10);
            System.out.println(list);
        }

        String str = "mama";
        int rr = str.length();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str);
            System.out.println(str.charAt(i));
        }

        String s = "s";
        String s1 = new String("s");

        Set<String> set = new HashSet<>();
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new TreeSet<>();

        for (String sss : set) {
            System.out.println(set);
            if(set.contains("asd")) {
                System.out.println();
            }
        }

    }
}
