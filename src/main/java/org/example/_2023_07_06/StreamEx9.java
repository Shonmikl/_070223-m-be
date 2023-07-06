package org.example._2023_07_06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//sequential()
public class StreamEx9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        Stream<Integer> stream = list.parallelStream().sequential();
    }
}