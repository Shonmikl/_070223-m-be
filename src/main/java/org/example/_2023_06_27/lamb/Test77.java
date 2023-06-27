package org.example._2023_06_27.lamb;

import java.util.Arrays;
import java.util.List;

public class Test77 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Oksana", "Vladislav", "Vadim");
//        for (String s : list) {
//            System.out.println(s);
//        }

        list.forEach(System.out::println);
    }
}