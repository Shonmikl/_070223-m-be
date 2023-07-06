package org.example._2023_07_06;

import org.example._2023_06_27.streamAPI.Str;

import java.util.ArrayList;
import java.util.List;

//onClose()
public class StreamEx10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vlad");
        names.add("Mik");
        names.add("Mick");
        names.add("V");

        names.stream()
                .filter(name -> name.startsWith("V"))
                .onClose(() -> System.out.println("Stream closed"))
                .forEach(System.out::println);

        System.out.println("/////////////////////////////////////////");

        names.stream()
                .filter(name -> name.startsWith("M"))
                .onClose(() -> closeStream(names))
                .forEach(System.out::println);
    }

    private static void closeStream(List<String> names) {
        System.out.println("Stream closed");
        names.clear();
    }
}