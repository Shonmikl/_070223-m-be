package org.example._2023_08_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * [] диапазон
 * ^ отрицание
 * $ выражение в конце строки
 * . любой символ
 */
public class Re2 {
    public static void main(String[] args) {
//        String s = "ABCD ABCD ABCDRANCDERRFEANABCD";
        String s = "OPAGTRSASTA8TA9T";
//        Pattern pattern  = Pattern.compile("A[^0-9A-C]T");
//        Pattern pattern  = Pattern.compile("A(G|S)T");
//        Pattern pattern = Pattern.compile("A[0-9]T.");
        Pattern pattern = Pattern.compile("A[A-Z]T");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
        }
    }
}