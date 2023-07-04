package org.example._2023_07_04;

import org.example._2023_06_27.streamAPI.Str;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Vlad", "Elena", "Dima");
        List<String> words1 = words.stream()
                .flatMap(str -> Arrays.stream(str.split("")))
                .toList();
        System.out.println(words1);


    }
}
