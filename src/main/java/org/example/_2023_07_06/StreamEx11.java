package org.example._2023_07_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//takeWhile()
public class StreamEx11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 2, 8, 4, 5, 6, 7, 8, 9);
        List<Integer> result = new ArrayList<>();

        numbers.stream()
                .takeWhile(num -> num % 2 == 0)
                .forEach(result::add);
        System.out.println(result);
    }
}