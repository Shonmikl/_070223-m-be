package org.example._2023_08_22;

public class MT6 implements Runnable {
    @Override
    public void run() {
        System.out.println("run(). The name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MT6());
        thread.start(); //run() !!!!!!!
        System.out.println("main(). The name: " + Thread.currentThread().getName());
    }
}