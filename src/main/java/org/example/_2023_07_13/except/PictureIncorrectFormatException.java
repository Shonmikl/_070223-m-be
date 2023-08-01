package org.example._2023_07_13.except;

import java.io.FileReader;
import java.io.IOException;

public class PictureIncorrectFormatException extends RuntimeException {
    public PictureIncorrectFormatException(String message) {
        super(message);
    }
}

class Main {
    /**
     *
     * @param path path to file
     * @throws IOException if file not exist
     */
    public void readPicture(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        int characters;

        while ((characters = fileReader.read()) != -1) {
            System.out.print((char) characters);
        }
        System.out.println("\n");
        System.out.println("Done!");
    }

    public static void main(String[] args) {
//        try {
//            new Main().readPicture("");
//        } catch (PictureIncorrectFormatException e) {
//            throw new RuntimeException(e);
//        }
    }
}