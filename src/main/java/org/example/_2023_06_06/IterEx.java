package org.example._2023_06_06;

import java.util.*;

public class IterEx {
//    public int get(int a) {
//        return get(a + 1);
//    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Set<String> set = new HashSet<>();
        list.add("Evegeny");
        list.add("Lera");
        list.add("VLADISLAV");
        list.add("Vadim");
        list.add("Vitaly");
        list.add("Oksana");

//        System.out.println(list);

        //Evegeny Lera VLADISLAV Vadim Vitaly Oksana
        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            iterator.next(); //Evegeny
//            iterator.remove();//Evegeny -- X
//        }
//        System.out.println(list + "!!!!");

        ListIterator<String> direct = list.listIterator();
        while (direct.hasNext()) {
            System.out.println(direct.next());
        }
        ListIterator<String> reverse = list.listIterator(list.size());
        while (reverse.hasPrevious()) {
            System.out.println(reverse.previous());
        }
    }
}
