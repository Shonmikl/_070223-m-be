package org.example._2023_08_24;

import org.example._2023_07_11.serial.Person1;

public class ME2 {
    static int counter = 0;
    //

    public static void increment() {
        //123
        synchronized (Person1.class) {
            counter++;
        }
        System.out.println("NAME: " + Thread.currentThread().getName() + " || COUNT: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        RII ri = new RII();
        Thread t1 = new Thread(ri);
        Thread t2 = new Thread(ri);
        Thread t3 = new Thread(ri);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}

class RII implements  Runnable {

    @Override
    public void run() {
        // 1 2 3
        for (int i = 0; i < 4; i++) {
            // 2 3
            ME2.increment();
        }
    }
}