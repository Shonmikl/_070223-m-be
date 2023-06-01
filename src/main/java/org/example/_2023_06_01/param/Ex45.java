package org.example._2023_06_01.param;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ex45 {
    public static void main(String[] args) {
        //<T>
        List<Double> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        list1.add("QQQ");

        list.add(8.5);

        print(list);
        print(list1);
    }

    static void print(List<?> list) {
        System.out.println("LIST: " + list);
    }
}
