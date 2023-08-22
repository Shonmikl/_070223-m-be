package org.example._2023_08_22;

public class MT9 extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        MT9 t1 = new MT9();
        t1.start();
        Thread.sleep(1500);
        System.out.println("Wake UP NEO!");
        t1.b = false;
        t1.join();
        System.out.println("Main End");
    }
}