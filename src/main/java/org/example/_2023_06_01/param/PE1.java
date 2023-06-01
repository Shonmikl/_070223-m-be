package org.example._2023_06_01.param;

import org.example._2023_05_30.Person;

import java.util.ArrayList;
import java.util.List;

public class PE1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /**
         * List<Integer> list = new ArrayList<>();
         * List list = new ArrayList();
         * list.add("String");
         * String str = list.get(0);
         * String str = (Integer) list.get(0);
         */
        List list1 = new ArrayList();

        list1.add("W");
        list1.add("QW");
        list1.add("Wwe");
        list1.add(new Person(";", 5, 5));

       for (Object s : list1) {
       }
    }
}
