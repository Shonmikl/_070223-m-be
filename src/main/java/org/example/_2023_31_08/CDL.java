package org.example._2023_31_08;

import java.util.concurrent.CountDownLatch;

public class CDL {
    //CountDownLatch
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void doService() throws InterruptedException {
        Thread.sleep(444);
        System.out.println("Everything cleaned up (1)");
        countDownLatch.countDown();
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    private static void checkSMTH() throws InterruptedException {
        Thread.sleep(444);
        System.out.println("Everything was checked (2)");
        countDownLatch.countDown();
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    private static void getReady() throws InterruptedException {
        Thread.sleep(444);
        System.out.println("Ready to go (3)");
        countDownLatch.countDown();
        System.out.println("CDL: " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Employee("Mark", countDownLatch);
        new Employee("Olga", countDownLatch);
        new Employee("Elena", countDownLatch);
        new Employee("Ivan", countDownLatch);
        new Employee("John", countDownLatch);

        doService();
        checkSMTH();
        getReady();
    }
}

class Employee extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Employee(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + "start to work....");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}