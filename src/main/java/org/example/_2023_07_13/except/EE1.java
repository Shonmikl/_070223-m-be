package org.example._2023_07_13.except;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EE1 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("wp8e.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}