package org.example._2023_07_06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

//mapMulti()
public class StreamEx7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        Stream.of(list)
                .flatMap(List::stream)
                .mapMulti((number, consumer) -> {
                    consumer.accept(number * number);
                    consumer.accept(number * number * number);
                }).forEach(System.out::println);
    }
}