package org.example._2023_09_14.dryKissYagni;

public class SUT {

    public static String toUpperCase1(String input) {
        return input.toUpperCase();
    }

    public static String toLowerCase2(String input) {
        return input.toLowerCase();
    }

    public static char[] toCharArray2(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }
}