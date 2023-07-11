package org.example._2023_07_11.fileIO;

import java.io.*;

//binary files
public class FileInputStreamAndOutputStream {
    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new FileReader("test.png"));
//             BufferedWriter writer = new BufferedWriter(new FileWriter("newTest.png"))) {
//             int character;
//             while ((character = reader.read()) != -1) {
//                 writer.write(character);
//             }
//            System.out.println("Done!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (FileInputStream inputStream = new FileInputStream("test.png");
             FileOutputStream outputStream = new FileOutputStream("newTest2.png")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}