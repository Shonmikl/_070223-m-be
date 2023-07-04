package org.example._2023_07_04;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 16, 54, 78, 9, 4, 56, 1, 23);

        //count
        long count = numbers.stream().count();
        System.out.println("Count: " + count);
        System.out.println("--------------------------------------------");

        //max
        Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());
        max.ifPresent(value -> System.out.println("Max: " + value));
        System.out.println(max);
        System.out.println("--------------------------------------------");

        //min
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(value -> System.out.println("Min: " + value));
        System.out.println(min);
        System.out.println("--------------------------------------------");

        //findFirst
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(value -> System.out.println("First: " + value));
        System.out.println("--------------------------------------------");

        //findAny
        Optional<Integer> any = numbers.stream().findAny();
        any.ifPresent(value -> System.out.println("Any: " + value));
        System.out.println("--------------------------------------------");

        //forEach
        System.out.println("ForEach: ");
        numbers.forEach(System.out::println);
        System.out.println("--------------------------------------------");

        //distinct
        List<Integer> dis = numbers.stream().distinct().toList();
        System.out.println("Distinct: " + dis);
        System.out.println("--------------------------------------------");

        //peek
        List<Integer> peekList = numbers.stream().map(el -> el * 10).peek(System.out::println).toList();
        System.out.println("Peek: " + peekList);
        System.out.println("--------------------------------------------");

        //limit
        List<Integer> limit = numbers.stream().limit(2).toList();
        System.out.println("Limit: " + limit);
        System.out.println("--------------------------------------------");

        //toArray
        Integer[] arr = numbers.toArray(Integer[]::new);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("--------------------------------------------");

        //reduce
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        sum.ifPresent(value -> System.out.println("Reduce: " + value));
        System.out.println("--------------------------------------------");

        //collect
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        System.out.println("Collect: " + set);

        //mapToInt
        int intSum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("MapToInt: " + intSum);
        System.out.println("--------------------------------------------");
    }
}