package org.example._2023_07_13.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileAndPathExample {
    public static void main(String[] args) {
        List<File> list = new ArrayList<>();
        getFiles(new File("E:\\"), list);

        for (File file : list) {
            System.out.println("[" + file.getAbsolutePath() + "]");
        }
        System.out.println("Files numbers is: " + list.size());
    }

    private static void getFiles(File root, List<File> fileList) {
        if (root.isDirectory()) {
            System.out.println("searching....." + root.getAbsolutePath());
            File[] directoryFiles = root.listFiles();

            if (directoryFiles != null) {
                for (File file : directoryFiles) {

                    if (file.isDirectory()) {
                        getFiles(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".pdf")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}