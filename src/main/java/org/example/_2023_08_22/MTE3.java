package org.example._2023_08_22;

public class MTE3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRun1());
        Thread t2 = new Thread(new MyRun2());

        t1.start();
        t2.start();

        System.out.println("######################");
    }
}

class MyRun1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRun1: " + i);
        }
    }
}

class MyRun2 implements Runnable {

    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("MyRun2: " + i);
        }
    }
}