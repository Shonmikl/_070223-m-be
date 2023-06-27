package org.example._2023_06_27.lamb;

import lombok.ToString;

@ToString
public class Test90 {
    public static void main(String[] args) {
        m1(el-> {
            System.out.println(el);
            System.out.println(el);
        });
    }

    public static void m1(Inter inter) {
        inter.get(null);
    }
}

@FunctionalInterface
interface Inter {
    void get(int[] arr);
}