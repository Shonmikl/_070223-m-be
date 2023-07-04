package org.example._2023_07_04;

import org.example._2023_06_27.streamAPI.Str;

import java.util.Optional;

public class OptEx {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of(null);
        if(optional.isPresent()) {
            String name = optional.get();
            System.out.println("Param: " + name);
        } else {
            System.out.println("Name is not valid");
        }
    }
}