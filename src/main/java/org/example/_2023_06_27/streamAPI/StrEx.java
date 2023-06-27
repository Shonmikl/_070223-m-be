package org.example._2023_06_27.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StrEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(13);
        list.add(32);
        list.add(33);
        list.add(43);

//        list.stream()
//                .forEach(System.out::println);

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Arrays.stream(arr)
//                .forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 2, 2, 3, 4, 5, 6);
//        stream.forEach(el -> System.out.println(el));

        Object[] s = stream.toArray();
        Arrays.stream(s);
        System.out.println(stream.distinct().count());
    }
}