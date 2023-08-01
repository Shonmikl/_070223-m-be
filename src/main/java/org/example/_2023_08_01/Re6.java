package org.example._2023_08_01;

public class Re6 {
    public static void main(String[] args) {
        String s = "Más        allá  del precio,los       consumidores también";
        s = s.replaceAll(" {2,}", " ");
        System.out.println(s);
    }
}