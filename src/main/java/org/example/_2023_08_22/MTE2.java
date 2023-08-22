package org.example._2023_08_22;

/**
 * Thread
 * Runnable
 * Callable
 */
public class MTE2 {
    public static void main(String[] args) {
        MyT1 t1 = new MyT1();
        MyT2 t2 = new MyT2();

        t1.start();
        t2.start();

        System.out.println("#######");
    }
}

class MyT1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyT1: " + i);
        }
    }
}

class MyT2 extends Thread {

    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("MyT2: " + i);
        }
    }
}