package org.example._2023_07_13;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File was created: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length() + " byte");

        boolean isDirectory = file.isDirectory();
        System.out.println("Is Directory " + isDirectory);

        File renameFile = new File("renamed.txt");
        boolean renamed = file.renameTo(renameFile);
        if (renamed) {
            System.out.println("File was renamed");
        }

        boolean deleted = renameFile.delete();
        if (deleted) {
            System.out.println("File was deleted");
        }
    }
}