package org.example._2023_08_24;

public class ME1  {
    public static void main(String[] args) throws InterruptedException {
        RI ri = new RI();
//        Thread t1 = new Thread(new RI());
//        Thread t2 = new Thread(new RI());
//        Thread t3 = new Thread(new RI());

        Thread t1 = new Thread(ri);
        Thread t2 = new Thread(ri);
        Thread t3 = new Thread(ri);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}

class Counter {
    int count = 0;
}

class RI implements Runnable {
    Counter counter = new Counter();
    public void increment() {
        counter.count++;
        System.out.println("NAME: " + Thread.currentThread().getName() + " || COUNT: " + counter.count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            increment();
        }
    }
}