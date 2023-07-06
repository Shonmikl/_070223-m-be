package org.example._2023_07_06;

import org.example._2023_06_27.streamAPI.Str;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//groupingBy
//partitioningBy
public class StreamEx6 {
    public static void main(String[] args) {
//        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list2.stream()
//                .collect(Collectors.groupingBy(n -> n % 3));
//        System.out.println(list2);
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "coffee");
        Map<Integer, List<String>> st = stringList.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(st);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> map
                = list1.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(map);
    }
}