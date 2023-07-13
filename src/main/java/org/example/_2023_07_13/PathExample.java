package org.example._2023_07_13;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("E:\\folder\\path.txt");

        System.out.println("File name: " + filePath.getFileName());
        System.out.println("Parent directory: " + filePath.getParent());
        System.out.println("Abs path: " + filePath.toAbsolutePath());

        Path subPath = filePath.subpath(0, 2);
        System.out.println("SubPath: " + subPath);

        boolean isExist = Files.exists(filePath);
        System.out.println("Is file exist: " + isExist);
    }
}
