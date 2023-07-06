package org.example._2023_07_06;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;


public class FriquencyAnalize {

    public static void main(String[] args) throws IOException {
        String contents = Files.readString(Paths.get("wp.txt"));
        List<String> words = Arrays.asList(contents.split("\\P{L}+")); //слово

        long count = words.stream().distinct().count();
        long countWithRepeat = words.size();
        System.out.println("Слов всего " + countWithRepeat);
        System.out.println("Уникальных слов  " + count);

        Arrays.stream(contents.split("\\P{L}+"))
                .collect(toMap(s -> s, n -> 1, Integer::sum))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(item -> System.out.println(item.getKey() + " " + item.getValue()));
    }
}