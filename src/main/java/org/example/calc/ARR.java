package org.example.calc;

import java.util.Random;

public class ARR {
    public static int[] getArr(int[] arr) {
        int n;
        if (arr.length % 2 == 0) {
            n = arr.length / 2;
        } else {
            n = arr.length / 2 + 1;
        }

        int[] result = new int[n];

        /**
         * 1 2 6 5 9 8 4 7 --> [1+7, 2+4, 6+8, 5+9]
         * 1 2 6 5 11 9 8 4 7 --> [1+7, 2+4, 6+8, 5+9, 11]
         */
        return arr;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt()];
        getArr(array);
    }
}
