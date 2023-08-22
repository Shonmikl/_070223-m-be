package org.example._2023_08_22;

public class MTE4 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Run: " + i);
            }
        }).start();
    }
}