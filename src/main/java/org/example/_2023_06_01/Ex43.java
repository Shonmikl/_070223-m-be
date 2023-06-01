package org.example._2023_06_01;

import java.util.Arrays;

public class Ex43 {
    public static void main(String[] args) {
        String s = "Hello!@#$$";
        String[] sa = s.split("");
        System.out.println(Arrays.toString(sa));


        String a = "Java";
        String b = new String("Java");
        //YAGNI DRY KISS

        String s1 = a + "!";
        String s2 = s1 + "*";
        a = a + "888";
             // x = 5
        String ee = "!!!";

        StringBuilder sb = new StringBuilder("Java");
        sb.append("!");

//        if("!!!".equals()) {
//
//        }
    }
}