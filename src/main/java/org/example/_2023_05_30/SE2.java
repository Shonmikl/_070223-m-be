package org.example._2023_05_30;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SE2 {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();
        Person p1 = new Person("Vladislav", 25, 1500);
        Person p2 = new Person("Dmitry", 28, 2500);
        Person p3 = new Person("Oksana", 24, 1200);
        Person p4 = new Person("Vadim", 30, 1900);
        Person p5 = new Person("Natalia", 29, 2100);
        Person p6 = new Person("Mikhail", 38, 9100);

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);
        personSet.add(p6);

        System.out.println(personSet);
    }
}