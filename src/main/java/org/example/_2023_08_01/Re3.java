package org.example._2023_08_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * \d - одна цифра
 * \D - одна НЕ цифра
 * \w - одна буква, цифра, "_"
 * \W
 * \s - пробел
 * \S
 */
public class Re3 {
    public static void main(String[] args) {
        String s = "ABCD ABCD A 1BCDRANCDERRFEANAB8CD";
        Pattern pattern = Pattern.compile("\\w{2}");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
        }
    }
}