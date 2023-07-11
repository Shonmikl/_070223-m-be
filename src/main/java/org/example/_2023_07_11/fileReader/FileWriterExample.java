package org.example._2023_07_11.fileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class FileWriterExample implements Serializable {
    public static void main(String[] args) {
        String s = "Bienvenido a BMW Outlet. " +
                "Aquí encontrarás tu BMW más barato, " +
                "con una amplia gama de vehículos seminuevos y " +
                "ofertas en coches de segunda mano por tiempo " +
                "limitado.";
//        int b = 0xFFFF;
//        System.out.println(b);

        try (FileWriter writer = new FileWriter("fileWriter.txt")) {
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}