package org.example._2023_06_06;

import java.util.ArrayList;
import java.util.List;

public class IterEx2 {
    private boolean isPal(String str) {
       StringBuilder stringBuilder = new StringBuilder(str); //madam
       String rev = stringBuilder.reverse().toString();
       boolean b = rev.equals(str);
       return b;
    }

    private boolean isPal1(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        String str = "madddam";

    }
}
