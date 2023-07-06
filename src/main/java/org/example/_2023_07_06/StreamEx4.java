package org.example._2023_07_06;

import java.util.Arrays;
import java.util.List;

//dropWhile
public class StreamEx4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 1, 3, 5, 7);
        List<Integer> list =  numbers.stream()
                .dropWhile(n -> n <= 5)
                .toList();
        System.out.println("Drop: " + list);
    }
}
