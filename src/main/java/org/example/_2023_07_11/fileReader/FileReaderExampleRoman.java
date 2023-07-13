package org.example._2023_07_11.fileReader;

import java.io.FileReader;
import java.io.IOException;

//text files
public class FileReaderExampleRoman {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("wpe.txt")) {
            int characters;

//            while ((characters = fileReader.read()) != -1) {
//                System.out.print((char) characters);
//            }

            for (int i = 0; i < 10; i++) {
                characters = fileReader.read();
                System.out.println((char)characters);
            }

            for (int i = 0; i < 10; i++) {
                characters = fileReader.read();
                System.out.println((char) characters);
            }

            System.out.println("\n");
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}