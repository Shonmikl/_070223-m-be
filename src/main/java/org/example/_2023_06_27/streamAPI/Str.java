package org.example._2023_06_27.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class Str {
    private static int getL(String s) {
        return s.length();
    }

    private static String getS(int a) {
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        getL("mama");

        int[] arr = {1, 8, 3, 4, 5, 6, 7, 2, getL(getS(88))};

//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] %2 == 0) {
//                System.out.println(arr[i] * 10);
//            }
//        }

        int[] dd = Arrays.stream(arr) // 1,8,3,4,5,6,7,2,8
                .filter(el -> el % 2 == 0) //8 4 6 2 8
                .map(el -> el * 10)// 80 40 60 20 80
                .sorted() // 20 40 60 80 80
                .distinct() // 20 40 60 80
                .toArray();
    }
}
